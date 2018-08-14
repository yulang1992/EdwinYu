package com.edwin.fsg.job;

import java.util.concurrent.TimeUnit;

import javax.annotation.PreDestroy;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edwin.fsg.common.Constants;
import com.edwin.fsg.service.IOrderBakService;

/***
 * 分布式定时关单任务
 */
@Component
@Configuration
@EnableScheduling
public class CloseOrderTask {

	private static final Logger log =LoggerFactory.getLogger(CloseOrderTask.class);
	
	@Reference
	private IOrderBakService orderBakService;
	
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	
	private static Long LOCKTIMEOUT=5000l;
	
	@PreDestroy
    public void delLock(){
		redisTemplate.opsForValue().getOperations().delete(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);

    }
	
	@Scheduled(cron="0 5 0 * * ?")
    public void closeOrderTaskV3(){
        log.info("关闭订单定时任务启动");
        long lockTimeout =LOCKTIMEOUT;
        
        //获取关单任务锁
        Boolean lockFlag =redisTemplate.opsForValue().setIfAbsent(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK, String.valueOf(System.currentTimeMillis()+LOCKTIMEOUT));
        if(lockFlag != null && lockFlag){ //获取到锁
            closeOrder(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
        }else{
            //未获取到锁，继续判断，判断时间戳，看是否可以重置并获取到锁
            String lockValueStr = (String) redisTemplate.opsForValue().get(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
             //判断当前时间戳是否大于 设置锁的时间戳  大于说明过期
            if(lockValueStr != null && System.currentTimeMillis() > Long.parseLong(lockValueStr)){
            	//重新获取锁信息
                String getSetResult = (String) redisTemplate.opsForValue().getAndSet(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK,String.valueOf(System.currentTimeMillis()+lockTimeout));
                //再次用当前时间戳getset。
                //返回给定的key的旧值，->旧值判断，是否可以获取锁
                //当key没有旧值时，即key不存在时，返回nil ->获取锁
                //这里我们set了一个新的value值，获取旧的值。
                if(getSetResult == null || (getSetResult != null && StringUtils.equals(lockValueStr,getSetResult))){
                    //真正获取到锁
                    closeOrder(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
                }else{
                    log.info("没有获取到分布式锁:{}",Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
                }
            }else{
                log.info("没有获取到分布式锁:{}",Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
            }
        }
        log.info("关闭订单定时任务结束");
    }
	
	 private void closeOrder(String lockName){
	    redisTemplate.opsForValue().getOperations().expire(lockName, 10, TimeUnit.SECONDS);//有效期10秒，防止死锁
	    log.info("获取{},ThreadName:{}",Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK,Thread.currentThread().getName());
	    orderBakService.closeOrder(2);  //关闭2小时未付款的订单
	    redisTemplate.opsForValue().getOperations().delete(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
	    log.info("释放{},ThreadName:{}",Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK,Thread.currentThread().getName());
	    log.info("===============================");
	  }
}

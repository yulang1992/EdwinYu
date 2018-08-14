package com.edwin.fsg.job;

import java.util.concurrent.TimeUnit;

import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edwin.fsg.common.Constants;
import com.edwin.fsg.config.RedissionProperties;
import com.edwin.fsg.service.IOrderBakService;

@Configuration
@EnableScheduling
@Component
public class RedissionJob {
	
	
private static final Logger log =LoggerFactory.getLogger(CloseOrderTask.class);
	
	@Reference
	private IOrderBakService orderBakService;
	
	@Autowired
	private RedissionProperties redissionProperties;
	
	
	@Scheduled(cron="0 */1 * * * ?")
    public void closeOrderTaskV4() throws Exception{
        log.info("关闭订单定时任务启动");
        RLock lock = redissionProperties.redisson().getLock(Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK);
        boolean getLock = false;
        try {
			if(getLock = lock.tryLock(0, 50, TimeUnit.SECONDS)){
			   log.info("Redisson获取到分布式锁:{},ThreadName:{}",Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK,Thread.currentThread().getName());
			  // orderBakService.closeOrder(2);
			   log.info("Redisson获取到分布式锁:{}","开始执行定时任务来");
			}else {
			  log.info("Redisson没有获取到分布式锁:{},ThreadName:{}",Constants.REDIS_LOCK.CLOSE_ORDER_TASK_LOCK,Thread.currentThread().getName());	
			}
		} catch (InterruptedException e) {
			log.error("Redisson分布式锁获取异常",e);
		}finally {
			if (!getLock) {
				return;
			}
			lock.unlock();
			log.info("Redisson分布式锁释放锁");
		}
    }
	
}

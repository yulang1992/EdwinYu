package com.edwin.fsg.service.impl;
import com.edwin.fsg.common.ConsumerTask;
import com.edwin.fsg.common.Message;
import com.edwin.fsg.mapper.OrderBakMapper;
import com.edwin.fsg.model.OrderBak;
import com.edwin.fsg.service.IOrderBakService;
import com.edwin.fsg.service.PrepareOrderService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
@Service
@Transactional
public class OrderBakServiceImpl implements IOrderBakService {
	
	private static final Logger logger =LoggerFactory.getLogger(OrderBakServiceImpl.class);
	
	@Reference
	private PrepareOrderService prepareOrderService;

	@Autowired
	private OrderBakMapper orderBakMapper;
	
	@Autowired
	private StringRedisTemplate redisTemplate;

	@Override
	public OrderBak getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBak> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public void insertOrder() {
//		prepareOrderService.checkSendMsg(Object t);
//	}
	
	//分布式操作
	public boolean fastOrder() {
		OrderBak orderBak =new OrderBak();
		orderBak.setAddress("武汉市洪山区关山大道紫菘逸景华庭");
		orderBak.setBuyerUserId(-1l);
		orderBak.setStatus(1);
		orderBak.setActivityId(-1l);
		orderBak.setExpressNumber("SF0000001");
		try {
			//StringRedisTemplate
			//执行预处理操作
			Assert.isTrue(prepareOrderService.pretreatSave(orderBak) > 0,"数据异常");
			//如处理成功 执行真正的业务操作
			orderBakMapper.insertOrderBak(orderBak);
			//检查发送mq的数据
			Boolean falg=prepareOrderService.checkSendMsg(orderBak);
			//失败之后需要往延时队列中添加 稍后重试发送
			if(!falg){
			  //需要发送延时消息
              DelayQueue<Message> quene=new DelayQueue<Message>();
              // 添加延时消息,m1 延时1s 
              quene.offer(new Message(redisTemplate.opsForValue().increment("DELAY_ID", 1).intValue(), orderBak, 500));
              //将延时消息放到延时队列中  
			  ConsumerTask task =new ConsumerTask(quene);
			  // 启动消费线程 消费添加到延时队列中的消息，前提是任务到了延期时间   
	          ExecutorService exec = Executors.newFixedThreadPool(1);  
	          exec.execute(task);  
	          exec.shutdown();  
			}
			logger.info("操作成功！");
		} catch (Exception e) {
			logger.error("预处理业务失败！", e);
			return false;
		}
		return true;
	}
}

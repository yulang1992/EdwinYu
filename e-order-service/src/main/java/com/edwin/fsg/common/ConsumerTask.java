/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月14日 上午9:33:59  
 * @version V1.0
 */  
package com.edwin.fsg.common;
import java.util.concurrent.DelayQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Reference;
import com.edwin.fsg.service.PrepareOrderService;

/**   
 * [***]   
 * @author: yulang
 * @date:   2018年8月14日 上午9:33:59  
 * @version V1.0
 */
@Component
public class ConsumerTask implements Runnable{
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumerTask.class);
	
	@Reference
	private  PrepareOrderService prepareOrderService;
	
	// 延时队列 ,消费者从其中获取消息进行消费 
	private DelayQueue<Message> queue;
	
	public ConsumerTask(DelayQueue<Message> queue) {
		this.queue=queue;
	}
   
	@Override
	public void run() {
	   try {
		 Message take = queue.take();
		 logger.info("消息信息未 ：" + take.toString());
		 prepareOrderService.checkSendMsg(take.getOrderBak());
	 } catch (InterruptedException e) {
		logger.error("延时消息发送失败",e);
	 }
	}

}

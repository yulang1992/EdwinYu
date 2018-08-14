/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月13日 下午5:15:17  
 * @version V1.0
 */  
package com.edwin.fsg.service.impl;

import java.util.List;

import javax.jms.Queue;
import javax.jms.Topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.MessagingException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.alibaba.dubbo.config.annotation.Service;
import com.edwin.fsg.mapper.MsgMapper;
import com.edwin.fsg.model.OrderBak;
import com.edwin.fsg.service.PrepareOrderService;

/**   
 * [消息预处理实现类]   
 * @author: yulang
 * @date:   2018年8月13日 下午5:15:17  
 * @version V1.0
 */
@Service
@Transactional
public class PrepareOrderServiceImpl implements PrepareOrderService {
    
	private static final Logger logger =LoggerFactory.getLogger(PrepareOrderServiceImpl.class);
	
	@Autowired
	private MsgMapper msgMapper;
	
	@Autowired
	private JmsMessagingTemplate  jmsMessagingTemplate;
	
    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;
	

	/**
	 * 检查返回的状态为成功则发送消息 到消息队列中去
	 */
	public Boolean checkSendMsg(OrderBak orderBak) {
	 Assert.isTrue(orderBak !=null, "参数不合法！");
	 //检查请求过来的 数据是否是正常的
	 String content ="需要发送到库存系统的数据";
     //先写死为正常的
	 try {
		jmsMessagingTemplate.convertAndSend(this.queue, orderBak);
	} catch (MessagingException e) {
		logger.error("消息发送异常", e);
		return false;
	}
	 return true;
	}


	@Override
	public Integer pretreatSave(OrderBak orderBak) {
		
		return null;
	}


	@Override
	public void deleteBatch(List<OrderBak> list) {
		
	}

	@Override
	public void delete(Long id) {
		
	}
}

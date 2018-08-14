/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月13日 下午5:27:23  
 * @version V1.0
 */  
package com.edwin.fsg.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

/**   
 * [创建消息对象]   
 * @author: yulang
 * @date:   2018年8月13日 下午5:27:23  
 * @version V1.0
 */
public class CreateMessage implements MessageCreator{

	@Override
	public Message createMessage(Session session) throws JMSException {
		return session.createTextMessage("测试消息！");
	}

}

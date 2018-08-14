/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月13日 下午5:32:01  
 * @version V1.0
 */  
package com.edwin.fsg.mq;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**   
 * [点对点和订阅模式的消息发布]   
 * @author: yulang
 * @date:   2018年8月13日 下午5:32:01  
 * @version V1.0
 */
@Component
@EnableScheduling
public class MessageProducer {
	
	@Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay=3000)//每3s执行1次
    public void send() {
        //send queue.
        this.jmsMessagingTemplate.convertAndSend(this.queue, "hi,activeMQ");
        //send topic.
        this.jmsMessagingTemplate.convertAndSend(this.topic, "hi,activeMQ(topic)");
    }

}

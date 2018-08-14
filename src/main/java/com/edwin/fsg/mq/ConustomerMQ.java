/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月14日 上午10:39:29  
 * @version V1.0
 */  
package com.edwin.fsg.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edwin.fsg.model.OrderBak;
import com.edwin.fsg.service.PrepareOrderService;
import com.edwin.fsg.service.StockService;


/**   
 * [消息消费]   
 * @author: yulang
 * @date:   2018年8月14日 上午10:39:29  
 * @version V1.0
 */
@Component
public class ConustomerMQ {
	
	@Autowired
	private StockService stockService;
	
	@Reference
	private PrepareOrderService prepareOrderService;
	
	private static final Logger logger =LoggerFactory.getLogger(ConustomerMQ.class);
	
	
	@JmsListener(destination="edwin.queue")
	public void msgRead(Object o) {
		OrderBak orderBak =(OrderBak) o;
		Assert.isTrue(orderBak !=null, "参数异常！");
		//库存业务 扣减成功
		stockService.insertStock();
		prepareOrderService.delete(orderBak.getId());
	}

}

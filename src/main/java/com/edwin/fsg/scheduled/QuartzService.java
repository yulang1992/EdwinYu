/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月14日 上午10:50:43  
 * @version V1.0
 */  
package com.edwin.fsg.scheduled;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edwin.fsg.model.OrderBak;
import com.edwin.fsg.service.PrepareOrderService;
import com.edwin.fsg.service.StockService;

/**   
 * [定时清理完成的消息数据]   
 * @author: yulang
 * @date:   2018年8月14日 上午10:50:43  
 * @version V1.0
 */
@Component
public class QuartzService {
    
	@Reference
	private PrepareOrderService PrepareOrderService;
	
	@Autowired
	private StockService StockService;
	
   //  每分钟启动
   @Scheduled(cron = "0 0/1 * * * ?")
   public void timerToNow(){
	   
	   Map<String,Object> map =new HashMap<String,Object>();
	   map.put("status", 1); //完成的订单
	   /**
	    * 查询出从订单系统过来 生成了数据的订单
	    */
	   List<OrderBak> list=StockService.selectAll(map);
	   if(list !=null && list.size() >0){
		   PrepareOrderService.deleteBatch(list);
	   }
   }
}

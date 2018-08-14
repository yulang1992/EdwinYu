/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月13日 下午5:13:29  
 * @version V1.0
 */  
package com.edwin.fsg.service;

import java.util.List;

import com.edwin.fsg.model.OrderBak;

/**   
 * [消息预处理实现类]   
 * @author: yulang
 * @date:   2018年8月13日 下午5:13:29  
 * @version V1.0
 */
public interface PrepareOrderService {
    
	public Integer pretreatSave(OrderBak orderBak);
	
	public Boolean checkSendMsg(OrderBak orderBak);
	
	public void deleteBatch(List<OrderBak> list);
	
	public void delete(Long id);
}

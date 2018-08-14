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

	/**   
	 * [删除成功的业务数据]   
	 * @author: yulang
	 * @date:   2018年8月14日 上午10:49:18  
	 * @version V1.0
	 */  
	public void delete(Long id);

	/**   
	 * [***]   
	 * @author: yulang
	 * @date:   2018年8月14日 上午11:00:20  
	 * @version V1.0
	 */  
	public void deleteBatch(List<OrderBak> list);
}

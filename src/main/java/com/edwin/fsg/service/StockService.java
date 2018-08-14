/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月14日 上午10:45:38  
 * @version V1.0
 */  
package com.edwin.fsg.service;

import java.util.List;
import java.util.Map;

import com.edwin.fsg.model.OrderBak;

/**   
 * [***]   
 * @author: yulang
 * @date:   2018年8月14日 上午10:45:38  
 * @version V1.0
 */
public interface StockService {
	
   public void insertStock();

/**   
 * [***]   
 * @author: yulang
 * @date:   2018年8月14日 上午10:58:30  
 * @version V1.0
 */  
public List<OrderBak> selectAll(Map<String, Object> map);

}

/**   
 * [****]
 * @author: yulang
 * @date:   2018年8月14日 上午9:27:45  
 * @version V1.0
 */  
package com.edwin.fsg.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import com.edwin.fsg.model.OrderBak;

/**   
 * [消息体定义 实现Delayed接口就是实现两个方法即compareTo 
 *   和 getDelay最重要的就是getDelay方法，
 *    这个方法用来判断是否到期…… ]   
 * @author: yulang
 * @date:   2018年8月14日 上午9:27:45  
 * @version V1.0
 */
public class Message implements Delayed{
	
	 private int id;  
	 private OrderBak orderBak; // 消息内容  
	 private long excuteTime;// 延迟时长，这个是必须的属性因为要按照这个判断延时时长。 
	 
	 public int getId() {
		return id;
	}

	public OrderBak getOrderBak() {
		return orderBak;
	}

	public long getExcuteTime() {
		return excuteTime;
	}

	public Message (int id,OrderBak orderBak,long excuteTime) {
		this.id=id;
		this.orderBak=orderBak;
		this.excuteTime=TimeUnit.NANOSECONDS.convert(excuteTime, TimeUnit.MILLISECONDS) + System.nanoTime();
	 }
	 
	/**
	 * 自定义实现比较方法返回 1 0 -1三个参数  
	 */
	@Override
	public int compareTo(Delayed delayed) {
		Message msg = (Message) delayed;  
        return Integer.valueOf(this.id) > Integer.valueOf(msg.id) ? 1  
                : (Integer.valueOf(this.id) < Integer.valueOf(msg.id) ? -1 : 0);  
	}

	// 延迟任务是否到时就是按照这个方法判断如果返回的是负数则说明到期否则还没到期  
	@Override
	public long getDelay(TimeUnit unit) {
		 return unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);  
	}
}
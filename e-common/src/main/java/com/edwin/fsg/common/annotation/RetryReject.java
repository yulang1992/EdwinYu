package com.edwin.fsg.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [重试策略注解类]  
 * @author: yulang
 * @date:   2018年7月27日 上午11:45:13  
 * @version V1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RetryReject {
    
	 /** 默认重试3次 */
	int retryNum() default 3 ;
	
	/**间隔重试时间开关 默认不开启*/
	/**如果开启 则是按照默认按照 1ms * 重试次数  = 总共多少秒    第一重试 1ms,第二次 2ms */
	boolean disOpend() default false;
	
	
}

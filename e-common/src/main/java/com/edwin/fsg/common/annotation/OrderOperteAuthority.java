package com.edwin.fsg.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 操作订单的方法权限
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderOperteAuthority {
	/**
	 * 操作方法所需的用户类型 1:买方 2:卖方
	 * 
	 * @return
	 */
	int userType();
}

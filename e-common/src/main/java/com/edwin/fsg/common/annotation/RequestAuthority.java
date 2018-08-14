package com.edwin.fsg.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 设置访问请求所需要的权限
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestAuthority {
	/**
	 * 访问请求所需的用户类型 1:买方 2:卖方
	 * 
	 * @return
	 */
	int userType();
}

package com.edwin.fsg.aop.base;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import com.edwin.fsg.common.exception.FrameworkException;

public class BaseAspect {
	/**
	 * [通过织入点获取源方法]
	 * 
	 * @version [版本, 2017-04-12]
	 */
	protected Method getSourceMethod(JoinPoint joinPoint){
		Method proxyMethod = ((MethodSignature) joinPoint.getSignature()).getMethod();
		try {
			return joinPoint.getTarget().getClass().getMethod(proxyMethod.getName(), proxyMethod.getParameterTypes());
		} catch (Exception e) {
			throw new FrameworkException("Error when execute method[PermissionAspect.getSourceMethod].", e);
		}
	}
}

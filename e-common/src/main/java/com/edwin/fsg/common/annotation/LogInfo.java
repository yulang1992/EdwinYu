package com.edwin.fsg.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:日志注解类 
 * @author: yulang
 * @date:   2018年7月18日 上午11:05:46  
 * @version V1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogInfo {
  
  /** 是否开启记录日志的开关  默认开启 false不开启 */
  public boolean flag() default true ;
  
  /** 日志名称 */
  public String name() default "";
}

package com.edwin.fsg.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记model类的需要导出到Excel的字段
 * 
 * @author wangxuejun
 * @date 2016-7-14
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExportField {

	public String value() default "";

}

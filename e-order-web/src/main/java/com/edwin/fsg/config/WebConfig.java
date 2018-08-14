package com.edwin.fsg.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.edwin.fsg.interceptor.LoginInterceptor;
/**
 * 
 * @Description:web容器配置类  
 * @author: yulang
 * @date:   2018年7月10日 下午1:51:44  
 * @version V1.0
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Autowired
	private LoginInterceptor loginInterceptor;

	
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(loginInterceptor);
	}

//	
//	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
//		super.extendHandlerExceptionResolvers(exceptionResolvers);
//	}
  
	
}

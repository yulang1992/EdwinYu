package com.edwin.fsg.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
/**
 * 
 * @Description:TODO(DuridConfig  配置类)   
 * @author: yulang
 * @date:   2018年7月10日 上午10:18:55  
 * @version V1.0
 */
@Configuration
public class DuridConfig {

	//千万注意这个不行掉
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DruidDataSource getDruidDataSource() {
		return new DruidDataSource();
	}
	
	/**
	 * @Description:  DruidDataSource 配置 一个servlet 容器 
	 * @author: yulang
	 * @date:   2018年7月10日 上午10:30:48  
	 * @version V1.0
	 */
	@Bean
	public ServletRegistrationBean getDruidServlert() {
		ServletRegistrationBean bean =new ServletRegistrationBean(new StatViewServlet(),"/durid/*");
		Map<String, String> initParameters =new HashMap<>();
		initParameters.put("loginUsername","yulang");
		initParameters.put("loginPassword", "yulang123456");
		initParameters.put("allow","127.0.0.1"); //白名单
		initParameters.put("deny", "192.168.0.19"); //黑名单
		bean.setInitParameters(initParameters);
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean getWebStatFilter() {
		FilterRegistrationBean bean =new  FilterRegistrationBean();
		bean.setFilter(new WebStatFilter());
		Map<String, String> param =new HashMap<>();
		//排除路径显示
		param.put("exclusions", "*.png,*.jpg,*.jpeg,*.css,*.js,*.ico,/durid/*");  
		bean.setInitParameters(param);
		return bean;
	}
}

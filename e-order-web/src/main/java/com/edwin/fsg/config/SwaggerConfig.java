package com.edwin.fsg.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:TODO(swagger配置类)   
 * @author: yulang
 * @date:   2018年7月6日 下午5:58:17  
 * @version V1.0
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(prefix="guns",name="swagger-open",havingValue="true")
public class SwaggerConfig {
	
	@Bean
	public Docket createRestApi() {
	  return new Docket(DocumentationType.SWAGGER_2)
			  .apiInfo(apiInfo())
			  .select()
			  //这里采用包含注解的方式来确定要显示的接口
			  .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
			  //这里采用包扫描的方式来确定要显示的接口
			   //.apis(RequestHandlerSelectors.basePackage("com.edwin.guns.modular.system.controller"))   
			  .paths(PathSelectors.any())
			  .build();
	}

	private ApiInfo apiInfo() {
		Contact contact =new Contact("EdwinYu", "https://user.qzone.qq.com/791076963/infocenter", "yulang-jl@outlook.com");
		 return new ApiInfoBuilder()
	                .title("Guns Doc")
	                .description("Guns Api文档")
	                .termsOfServiceUrl("https://user.qzone.qq.com/791076963/infocenter")
	                .contact(contact)
	                .version("2.0")
	                .build();
	}

}

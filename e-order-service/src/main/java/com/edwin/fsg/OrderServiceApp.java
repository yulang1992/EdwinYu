package com.edwin.fsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Description:TODO(订单服务启动类)   
 * @author: yulang
 * @date:   2018年7月10日 上午10:17:09  
 * @version V1.0
 */
@SpringBootApplication
@MapperScan("com.edwin.fsg.mapper")
public class OrderServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApp.class, args);
	}

}

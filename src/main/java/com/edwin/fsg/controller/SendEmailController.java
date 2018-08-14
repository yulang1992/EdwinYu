package com.edwin.fsg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description:邮件发送管理  
 * @author: yulang
 * @date:   2018年7月16日 上午11:44:10  
 * @version V1.0
 */

import com.edwin.fsg.common.Result;
import com.edwin.fsg.service.SendMailService;
@RestController
public class SendEmailController {
	
	@Autowired
	private SendMailService sendMial;
	
	@RequestMapping("/send")
	public Result sendMail(){
	 Result result =new Result();
	 try {
		Assert.isTrue(sendMial.sendMail(),"邮件发送失败");
	} catch (Exception e) {
		throw new RuntimeException("邮件服务器异常！");
	}
	 return  result.success("操作成功！");
	}
  
}

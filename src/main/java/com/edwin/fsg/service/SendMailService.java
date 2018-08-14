package com.edwin.fsg.service;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class SendMailService {

	private static final Logger logger =LoggerFactory.getLogger(SendMailService.class);
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String SenderTo; // 读取配置文件中的参数
	
	@Async
	public Boolean sendMail() {
		try {
			logger.info("----------------开始发送邮件------------------");
			final MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			final MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
			messageHelper.setFrom(SenderTo); /// 发送者
			messageHelper.setTo("yulang-jl@outlook.com"); // 接收者，到时候通过参数传过来
			messageHelper.setSubject("测试邮件主题");
			messageHelper.setText("测试邮件内容");

			// //org.springframework.core.io.FileSystemResource下的:
			//
			// //附件1,获取文件对象.
			//
			// FileSystemResource file1 = new
			// FileSystemResource(newFile("D:/test/head/head1.jpg"));
			//
			// //添加附件，这里第一个参数是在邮件中显示的名称，也可以直接是head.jpg，但是一定要有文件后缀，不然就无法显示图片了。
			//
			// helper.addAttachment("头像1.jpg", file1);
			//
			// //附件2
			//
			// FileSystemResource file2 = new
			// FileSystemResource(newFile("D:/test/head/head2.jpg"));
			//
			// helper.addAttachment("头像2.jpg", file2);
			logger.info("发送邮件对象信息为：" + mimeMessage.toString());
			javaMailSender.send(mimeMessage);
			logger.info("邮件发送成功！");
			return true;
		} catch (Exception e) {
			throw new RuntimeException("邮件发送失败！ " + e.getMessage());
		}
		
	}
}

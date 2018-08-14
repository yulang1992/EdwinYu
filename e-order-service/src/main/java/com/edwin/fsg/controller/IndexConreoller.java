package com.edwin.fsg.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edwin.fsg.mapper.UserMapper;
import com.edwin.fsg.model.User;
import com.edwin.fsg.service.IUserService;

@RestController
public class IndexConreoller {

	@Autowired
	private IUserService userMapper;
	
	@RequestMapping("/index")
	public User getIndex(HttpServletResponse response) {
		User user=userMapper.getById(2l);
		return user;
	}
}

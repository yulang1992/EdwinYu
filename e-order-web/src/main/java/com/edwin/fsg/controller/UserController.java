package com.edwin.fsg.controller;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletWebRequest;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.edwin.fsg.common.Constants;
import com.edwin.fsg.common.Result;
import com.edwin.fsg.common.annotation.LogInfo;
import com.edwin.fsg.common.annotation.RetryReject;
import com.edwin.fsg.common.enums.ErrorCode;
import com.edwin.fsg.model.User;
import com.edwin.fsg.service.IUserService;
import com.edwin.fsg.util.CookiesUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	
	private static final Logger logger =LoggerFactory.getLogger(UserController.class);
	
	@Reference
	private IUserService userService;
	
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;
	
	@RequestMapping("/getUser")
	@LogInfo(flag=true,name="获取用户信息")
	@ApiOperation(value="获取用户信息",notes="取出cookie中的用户信息")
	public User getUser(HttpServletRequest request,HttpServletResponse response) {
		String cookieValue = CookiesUtil.getCookieValue(request);
		User user =null;
		if(StringUtils.isBlank(cookieValue)) {
			user = userService.getById(2l);
			logger.info("user: "+user);
			if(user !=null){
				String key =UUID.randomUUID().toString().replaceAll("-", "");
				redisTemplate.opsForValue().set(key,user,Constants.USER_REDIS_EXPIRSE,TimeUnit.SECONDS);
				CookiesUtil.saveCookie(key, JSON.toJSONString(user),response);
			}
		}else {
			user =JSON.parseObject((String)redisTemplate.opsForValue().get(cookieValue),User.class);
		}
		return user;
	}
    
	@RequestMapping("/getIndex")
	@ApiOperation(value="获取用户信息",notes="根据id用户信息")
	@ApiImplicitParam(name="id",value="用户iD",paramType="Long",required=true,dataTypeClass=User.class)
	public User getUsers(Long id) {
		return userService.getById(2l);
	}
	
	@RequestMapping("/get")
	@ResponseBody
	@RetryReject(disOpend=true)
	public Result getUserIndex(Long id) {
		Result result=new Result();
		User user = userService.getById(id);
		if(user == null){
			result.setError(ErrorCode.ERROR);
		}
		return result;
	}
	
//	@ApiImplicitParams({
//        @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
//        @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//      })
}

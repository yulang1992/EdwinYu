package com.edwin.fsg.service.impl;

import com.edwin.fsg.common.Constants;
import com.edwin.fsg.mapper.UserMapper;
import com.edwin.fsg.model.User;
import com.edwin.fsg.service.IUserService;
import com.edwin.fsg.util.CookiesUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
@Service
public class UserServiceImpl  implements IUserService {
	
	private static final Logger logger =LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
    private RedisTemplate<Object,Object> redisTemplate;
	
	@Autowired
	private UserMapper userMapper;

	public User getByToken(HttpServletResponse response, String token) {
		Assert.isTrue(StringUtils.isNotBlank(token), "token信息为空！");
		//User  user= (User) redisTemplate.opsForValue().get(token);
		User user = (User) redisTemplate.opsForValue().get(token);
		if(null !=user){
			return user;
		}
		return null;
	}

	@Override
	public User getById(Long id) { 
	   User user = userMapper.getById(id);
	   logger.info("user --- {}",user);
	   return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectById(Long id, HttpServletResponse response) {
		User user = userMapper.getById(id);
		String key =UUID.randomUUID().toString().replaceAll("-", "");
		CookiesUtil.saveCookie(Constants.COOKIES_NAME_SESSION,key, response);
		redisTemplate.opsForValue().set(key, JSON.toJSONString(user));
		return user;
	}
	
}

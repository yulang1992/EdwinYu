package com.edwin.fsg.service;

import com.edwin.fsg.model.User;

import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;


/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public interface IUserService extends BaseService<User,Long> {
   
	User getByToken(HttpServletResponse response,String token);
	
    User selectById(Long id,HttpServletResponse response);
}

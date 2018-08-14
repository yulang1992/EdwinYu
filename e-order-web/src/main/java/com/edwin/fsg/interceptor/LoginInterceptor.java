package com.edwin.fsg.interceptor;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.edwin.fsg.common.Constants;
import com.edwin.fsg.common.Constants.CONTROLLER_RESULT;
import com.edwin.fsg.common.Result;
import com.edwin.fsg.common.enums.ErrorCode;
import com.edwin.fsg.model.User;
import com.edwin.fsg.service.IUserService;
import com.edwin.fsg.util.CookiesUtil;
import com.edwin.fsg.util.RequestUtil;

/**
 * @Description:用户登录拦截器
 * @author: yulang
 * @date:   2018年7月10日 下午1:58:32  
 * @version V1.0
 */
@Service
public class LoginInterceptor  extends HandlerInterceptorAdapter{
	
	private static final Logger log =LoggerFactory.getLogger(LoginInterceptor.class);
    
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	
	@Reference
	private IUserService userService;
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("进入拦截器************************************");
		
		// 放入项目根路径
		String basePath = request.getContextPath() + "/" + "front";
		request.getSession().setAttribute("basePath", basePath);
		
		// 保存访问的路径
		if ("GET".equalsIgnoreCase(request.getMethod())) {
			RequestUtil.saveRequest();
		}
		if(handler instanceof HandlerMethod){
		  User user =getLoginUser(request,response);
		  if(user ==null) {
			  log.info("----- Has not login or logout! -----");
				// 用户未登录,判断当前是异步请求还是跳转页面的请求
				if (isAjaxMethod(handler)) {
					// ajax请求中统一返回json格式
					Result result = new Result();
					result.setError(ErrorCode.NOT_LOGGED_IN, "未登录或登录超时!");
					RequestUtil.writeData(response, JSON.toJSONString(result));
				} else {
					// 直接跳转到登录页面
				//	response.sendRedirect("/YSHomePage/index.jsp");
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
				return false; 
		  }
		}
		return true;
	}
    
	/**
	 * <必须约定,controller中的ajax请求处理方法都必须在方法上加上ResponseBody注解><br>
	 * 判断是否是异步方法,true:是异步,false:不是异步
	 * 
	 * @param handler
	 * @return
	 */
	private boolean isAjaxMethod(Object handler) {
		if (handler instanceof HandlerMethod) {
			// 如果当前请求是HandlerMethod,需要判断controller方法上的注解
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			Method method = handlerMethod.getMethod();
			// 如果method被ResponseBody注解标注,则说明当前方法是异步方法
			if (method.isAnnotationPresent(ResponseBody.class)) {
				return true;
			}
		}
		return false;
	}


	private User getLoginUser(HttpServletRequest request, HttpServletResponse response) {
		//先取出请求中的cookie信息
		String paramToken = request.getParameter(Constants.COOKIES_NAME_SESSION);
		String tokenCookie=CookiesUtil.getCookieValue(request);
		if(StringUtils.isEmpty(tokenCookie) && StringUtils.isEmpty(paramToken)) {
			return null;
		}
		String token = StringUtils.isEmpty(paramToken)?tokenCookie:paramToken;
		String userVal=(String) redisTemplate.opsForValue().get(token);
		if(StringUtils.isNotBlank(userVal)){
			return JSON.parseObject(userVal, User.class);
		}
		
		User u=userService.getById(2l);
		redisTemplate.opsForValue().set(tokenCookie, JSON.toJSONString(u), Constants.USER_REDIS_EXPIRSE, TimeUnit.SECONDS);
		CookiesUtil.saveCookie(tokenCookie, JSON.toJSONString(u), response);
		return u;
	}

	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("拦截器   执行方法************************************");
		super.postHandle(request, response, handler, modelAndView);
	}

	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("方法执行完退出拦截器拦截器************************************");
		super.afterCompletion(request, response, handler, ex);
	}

	
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("afterConcurrentHandlingStarted 拦截器拦截器************************************");
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
   

}

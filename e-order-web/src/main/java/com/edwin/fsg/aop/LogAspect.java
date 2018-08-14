package com.edwin.fsg.aop;


import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.edwin.fsg.aop.base.BaseAspect;
import com.edwin.fsg.common.annotation.LogInfo;
import com.edwin.fsg.model.MLog;
import com.edwin.fsg.model.User;
import com.edwin.fsg.service.LogMapperService;
import com.edwin.fsg.util.CookiesUtil;

/**
 * 
 * @Description:日志切面类
 * @author: yulang
 * @date:   2018年7月18日 上午10:45:29  
 * @version V1.0
 */
@Aspect
@Component
public class LogAspect  extends BaseAspect{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Reference
	private LogMapperService logMapperService;
	
	@Pointcut("@annotation(com.edwin.fsg.common.annotation.LogInfo) and @annotation(org.springframework.web.bind.annotation.RequestMapping) and execution(public * com.edwin.fsg..controller..*Controller.*(..))")
	public void authAspect() {

	}

	@Before("authAspect()")
	public void beforeMethod(JoinPoint joinPoint) {
		
		String methodFullName = String.format("%s.%s", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName());
		logger.info(String.format("Begin validate curUser's permission on the method[%s].", methodFullName));

		String  params= parseJoinPointArgs(joinPoint);
		logger.info("params:{}" ,params);
		
		logger.info("进入切面方法");
		
		// 从请求中获取当前登录人信息
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
		String cookiesValue = CookiesUtil.getCookieValue(request);
		logger.info("cookiesValue :{}",cookiesValue);
		User u=null;
		if(StringUtils.isBlank(cookiesValue)){
			logger.info("用户cookiesValue信息为空-----------");
		}else {
			//String userStr = redisTemplate.opsForValue().get(cookiesValue);
		//	if(StringUtils.isBlank(userStr)){
			//	logger.info("---------redis 缓存为空");
			//	return ;
			//}
		 // u=JSON.parseObject(userStr, User.class);
		}
		
		Method sourceMethod = getSourceMethod(joinPoint);
		
		logger.info("sourceMethod :{}",sourceMethod);
		
		LogInfo validate = sourceMethod.getAnnotation(LogInfo.class);
		logger.info("validate : {}",validate);
		if(validate !=null){ //如果存在日志注解
		  if(validate.flag()){  //是否开启日志
			String logname =validate.name();
			 MLog mlog =new MLog(new Date(),u==null?"XITONG":u.getUsername(),logname+"-->"+params);
			 logger.info("mlog---mlog :{}",mlog);
			 logMapperService.insertLog(mlog);
		  }
		}
		logger.info("joinPoint---targe :{}",joinPoint.getTarget());

	}

	private String parseJoinPointArgs(JoinPoint joinPoint) {
		Assert.isTrue(joinPoint !=null, "ERROR THE JoinPoint can be not null!");
		Object[] args = joinPoint.getArgs();
		StringBuffer sb =new StringBuffer();
		for(int i=0 ;i< args.length ;i++){
			Object arg = args[i];
			if (!(arg instanceof HttpServletRequest) && !(arg instanceof HttpServletResponse)) {
				sb.append(" param[" + i + "]:").append((arg.getClass().equals(String.class)) ? arg :JSON.toJSONString(arg));
			}
		}
		return sb.toString();
	}
	
}

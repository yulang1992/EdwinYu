package com.edwin.fsg.aop;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
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
import com.edwin.fsg.aop.base.BaseAspect;
import com.edwin.fsg.common.Result;
import com.edwin.fsg.common.annotation.RetryReject;
import com.edwin.fsg.service.LogMapperService;

/**
 * 
 * @Description:重试切面类
 * @author: yulang
 * @date:   2018年7月18日 上午10:45:29  
 * @version V1.0
 */
@Aspect
@Component
public class RetryRejectAspect  extends BaseAspect{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final Long DEFAULT_TIME =5000L;

	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Reference
	private LogMapperService logMapperService;
	
	@Pointcut("@annotation(com.edwin.fsg.common.annotation.RetryReject) and @annotation(org.springframework.web.bind.annotation.RequestMapping) and execution(public * com.edwin.fsg..controller..*Controller.*(..))")
	public void retryAspect() {

	}

	/**
	 * [失败重试策略]   
	 * @author: yulang
	 * @date:   2018年7月27日 下午5:33:46  
	 * @version V1.0
	 * @throws  
	 */
	@AfterReturning(returning="resultObj",value="retryAspect()")
	public void beforeMethod(JoinPoint joinPoint,Object resultObj){
		
		String methodFullName = String.format("%s.%s", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName());
		logger.info(String.format("Begin validate curUser's permission on the method[%s].", methodFullName));
		
		Assert.isTrue(resultObj !=null, "RETURN VALUE MUST NOT NULL!");
		
		Result result=(Result) resultObj;
		logger.info("result: "+ result);
		
		// 从请求中获取当前登录人信息
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
				
		//返回的不是成功的状态码
		if(!StringUtils.equals("1",result.getCode()) && !result.isSuccess()) {
			Method sourceMethod = getSourceMethod(joinPoint);
			RetryReject reject = sourceMethod.getAnnotation(RetryReject.class);
			if(reject.retryNum() > 0 ){
			  for(int i=0;i<reject.retryNum();i++){
				  try {
                      if(reject.disOpend()){ //开始时间间隔重试
                    	  logger.info("回调第: "+i+" 次");
                    	  Thread.sleep(i * DEFAULT_TIME);
                    	  result=(Result) sourceMethod.invoke(joinPoint.getTarget(), joinPoint.getArgs());
                      }else{ //默认直接重试
                    	  result=(Result) sourceMethod.invoke(joinPoint.getTarget(), joinPoint.getArgs()); 
                      }				  
                      logger.info("回调结果：{}",result.toString()); 
					  if(StringUtils.equals("1",result.getCode()) && result.isSuccess()) {
						 logger.info("回调成功！");
						 responseWriteData(response,result);
						 return ;
					  }
					  continue;  //失败继续重试
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | InterruptedException e) {
					logger.error("重试出现异常",e);
					continue;
				}
			  }
			}
		}
		
		logger.info("joinPoint---targe :{}",joinPoint.getTarget());

	}

	private void responseWriteData(HttpServletResponse response,Result result) {
	  PrintWriter writer=null;
	  try {
		logger.error("回调成功的数据为： {}" ,result.toString());
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		writer = response.getWriter();
		writer.print(result);
		// 清楚数据流缓冲区
		writer.flush();
	   } catch (IOException e) {
		 logger.error("响应数据失败："+e.getMessage(), e);
	  }finally {
	    if(writer !=null){
		   writer.close();
	    }
	  }
	}
}

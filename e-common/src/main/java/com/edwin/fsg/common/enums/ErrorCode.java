package com.edwin.fsg.common.enums;

import com.edwin.fsg.common.exception.FrameworkException;
import com.edwin.fsg.common.exception.bussiness.AssertFailedException;
import com.edwin.fsg.common.exception.bussiness.LoginFailedException;
import com.edwin.fsg.common.exception.bussiness.NotLoggedInException;
import com.edwin.fsg.common.exception.bussiness.PermissionDeniedException;
import com.edwin.fsg.common.exception.bussiness.RequestFailedException;


/**
 * [Controller返回结果的结果码]
 * 
 * @author Chris li[黎超]
 * @version [版本, 2017-04-12]
 * @see
 */
public enum ErrorCode {
	/**
	 * 成功
	 */
	SUCCESS("1", "成功!", null),
	/***************************** 登录异常 **************************/
	/**
	 * 用户未登录
	 */
	NOT_LOGGED_IN("1000", "用户未登录!", NotLoggedInException.class),
	/**
	 * 登录失败
	 */
	LOGIN_FAILED("1001", "登录失败!", LoginFailedException.class),
	/**
	 * 账号或密码为空
	 */
	USERNAME_OR_PASSWORD_MISSING("1001", "账号或密码为空!", LoginFailedException.class),
	/**
	 * 账号或密码为空
	 */
	USERNAME_OR_PASSWORD_ILLEGAL("1001", "账号或密码错误!", LoginFailedException.class),
	/**
	 * 无可使用公司
	 */
	HAS_NO_ACCESS_COMPANY("1001", "当前登录用户无可使用公司!", LoginFailedException.class),
	/**
	 * 登录员工被禁用
	 */
	LOGIN_EMPLOYEE_DISABLED("1001", "登录员工被禁用!", LoginFailedException.class),
	/**
	 * 登录员工非操作员
	 */
	LOGIN_EMPLOYEE_IS_NOT_OPERATOR("1001", "登录员工非操作员!", LoginFailedException.class),
	/**
	 * 登录集团被禁用
	 */
	LOGIN_GROUP_DISABLED("1001", "登录员工所属集团被禁用!", LoginFailedException.class),
	/**
	 * 登录集团被删除
	 */
	LOGIN_GROUP_DELETED("1001", "登录员工所属集团被删除!", LoginFailedException.class),
	/**
	 * 登录公司被禁用
	 */
	LOGIN_COMPANY_DISABLED("1001", "登录员工所属公司被禁用!", LoginFailedException.class),
	/**
	 * 登录公司被删除
	 */
	LOGIN_COMPANY_DELETED("1001", "登录员工所属公司被删除!", LoginFailedException.class),
	/**
	 * 登录公司为空
	 */
	LOGIN_COMPANY_MISSING("1001", "登录公司为空!", LoginFailedException.class),
	/**
	 * 登录公司非法
	 */
	LOGIN_COMPANY_ILLEGAL("1001", "登录公司非法!", LoginFailedException.class),
	/**
	 * 微信账号登录参数不完整
	 */
	WECHAT_LOGIN_PARAMS_MISSING("1001", "微信账号登录参数不完整!", LoginFailedException.class),
	/**
	 * 微信账号自动登录openid获取失败
	 */
	WECHAT_AUTO_LOGIN_OPENID_MISSING("1001", "微信账号自动登录openid获取失败!", LoginFailedException.class),
	/**
	 * 微信账号自动登录签名非法
	 */
	WECHAT_AUTO_LOGIN_SIGNATURE_ILLEGAL("1001", "微信账号自动登录签名非法!", LoginFailedException.class),
	/**
	 * 微信账号自动登录失败
	 */
	WECHAT_AUTO_LOGIN_FAILED("1001", "微信账号自动登录失败,微信号未与ERP账号关联!", LoginFailedException.class),
	/***************************** 权限异常 **************************/
	/**
	 * 用户权限不足
	 */
	UNAUTHORIZED("1100", "用户权限不足!", PermissionDeniedException.class),
	/***************************** 请求异常 **************************/
	/**
	 * 请求失败异常
	 */
	REQUEST_FAILED("2000", "请求失败!", RequestFailedException.class),
	/**
	 * 请求的token丢失
	 */
	TOKEN_MISSING("2000", "令牌为空!", RequestFailedException.class),
	/**
	 * 请求的token丢失
	 */
	MINI_APP_CODE_MISSING("2000", "小程序编号为空!", RequestFailedException.class),
	/***************************** 系统异常 **************************/
	/**
	 * 断言验证失败异常
	 */
	ASSERT_FAILED("3000", "断言验证失败!", AssertFailedException.class),
	/***************************** 未知异常 **************************/
	/**
	 * 框架基础异常
	 */
	FRAMEWORK("9000", "框架基础异常!", FrameworkException.class),
	/***************************** 未知异常 **************************/
	/**
	 * 未知错误
	 */
	ERROR("9999", "未知错误", RuntimeException.class),

	;

	private final String code;

	private final String desc;

	private final Class<? extends Throwable> exceptionClazz;

	ErrorCode(String code, String desc, Class<? extends Throwable> exceptionClazz) {
		this.code = code;
		this.desc = desc;
		this.exceptionClazz = exceptionClazz;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public Class<? extends Throwable> getExceptionClazz() {
		return exceptionClazz;
	}
}

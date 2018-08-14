package com.edwin.fsg.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.apache.bcel.generic.ReturnaddressType;

import com.edwin.fsg.common.Constants.CONTROLLER_RESULT;
import com.edwin.fsg.common.enums.ErrorCode;



public class Result {

	/**
	 * 成功标识(默认为:失败)
	 */
	private boolean success = false;
	/**
	 * 错误编码
	 */
	private String code;
	/**
	 * 错误信息
	 */
	private String desc;
	/**
	 * 存放返回的数据结构
	 */
	private Map<String, Object> data = new HashMap<String, Object>();

	public boolean isSuccess() {
		return success;
	}

	public void setCode(String code) {
		this.code = code;
		this.success = ErrorCode.SUCCESS.getCode().equals(code);
	}

	public String getCode() {
		return code;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public void put(String key, Object obj) {
		this.data.put(key, obj);
	}

	/**
	 * [设置错误信息]
	 * 
	 * @author Chris li[黎超]
	 * @version [版本, 2017-04-12]
	 */
	public Result setError(String code, String desc) {
		setCode(code);
		setDesc(desc);
		return this;
	}

	/**
	 * [设置错误信息]
	 * 
	 * @author Chris li[黎超]
	 * @version [版本, 2017-04-12]
	 */
	public Result setError(ErrorCode errorCode) {
		setCode(errorCode.getCode());
		setDesc(errorCode.getDesc());
		return this;
	}

	/**
	 * [设置错误信息]
	 * 
	 * @author Chris li[黎超]
	 * @version [版本, 2017-04-12]
	 */
	public Result setError(ErrorCode errorCode, String desc) {
		setCode(errorCode.getCode());
		setDesc(StringUtils.isNotBlank(desc) ? desc : errorCode.getDesc());
		return this;
	}
   
	public Result success(String desc) {
	  setCode(ErrorCode.SUCCESS.getCode());
	  setDesc(StringUtils.isNotBlank(desc) ? desc : ErrorCode.SUCCESS.getDesc());
	  return this;
	}
	
	public Result() {
	  setCode(ErrorCode.SUCCESS.getCode());
      setDesc("SUCCESS");
	}
}

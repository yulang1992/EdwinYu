package com.edwin.fsg.common;


/**
 * 订单结果,为订单流程执行方法返回值,供订单专用
 * 
 * @author Chris li
 * 
 */
public class OrderResult {
	private boolean resultFlag;
	private String successMsg;
	private String errorMsg;
	
	/**
	 * 订单方法执行结果,true或false
	 */
	public boolean getResultFlag() {
		return resultFlag;
	}

	/**
	 * 如果执行失败,才会有值
	 * 
	 * @return
	 */
	public String getSuccessMsg() {
		return successMsg;
	}

	/**
	 * 如果执行失败,才会赋值
	 * 
	 * @return
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	public OrderResult(boolean resultFlag, String msg) {
		this.resultFlag = resultFlag;
		// 执行成功时,才会设置成功信息
		if (!resultFlag) {
			this.successMsg = msg;
		}
		// 执行失败时,才会设置错误信息
		if (!resultFlag) {
			this.errorMsg = msg;
		}
	}
}

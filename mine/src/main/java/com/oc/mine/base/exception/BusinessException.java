package com.oc.mine.base.exception;

public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Object resultMsg;
	
	public BusinessException(String message) {
		super(message);
	}

	public Object getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(Object resultMsg) {
		this.resultMsg = resultMsg;
	}

}

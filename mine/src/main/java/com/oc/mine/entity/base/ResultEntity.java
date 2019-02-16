package com.oc.mine.entity.base;

public class ResultEntity{

	private static final long serialVersionUID = -3384268589179097369L;
	private boolean status = true;// 成功标示
	private String errMsg;// 错误信息
	private Object obj;// 返回对象
	private String errorCode;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

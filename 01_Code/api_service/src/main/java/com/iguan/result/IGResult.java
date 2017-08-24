package com.iguan.result;
/**
 * 接口通用
 * @author miaoxy
 *
 */
public class IGResult {
	
	/**
	 * 状态Code
	 */
	private int code;
	
	/**
	 * 状态描述
	 */
	private String message;
	
	/**
	 * 其他返回数据
	 */
	private Object context;
	
	public IGResult() {}
	
	public IGResult(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getContext() {
		return context;
	}

	public void setContext(Object context) {
		this.context = context;
	}
	
	
	
}

package com.vuebg.generator.exceptions;

/**
 * 自定义异常
 * @author suphowe
 * @date 2019-12-23
 */
public class VuebgException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public VuebgException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public VuebgException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public VuebgException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public VuebgException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}

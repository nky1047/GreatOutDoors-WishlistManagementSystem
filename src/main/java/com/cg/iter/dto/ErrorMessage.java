package com.cg.iter.dto;

public class ErrorMessage {

	private String code;
	private String message ;
	private String timeStamp;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public ErrorMessage(String code, String message, String timeStamp) {
		super();
		this.code = code;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	
	
}

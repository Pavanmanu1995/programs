package com.mindtree.candyshop.dto;

public class ErrorDto {
	
	private String message;
	private String errorType;
	public ErrorDto() {
		super();
	}
	public ErrorDto(String message, String errorType) {
		super();
		this.message = message;
		this.errorType = errorType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	@Override
	public String toString() {
		return "ErrorDto [message=" + message + ", errorType=" + errorType + "]";
	}
	
	

}

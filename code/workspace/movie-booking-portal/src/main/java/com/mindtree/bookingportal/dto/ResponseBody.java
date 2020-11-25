package com.mindtree.bookingportal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
public class ResponseBody<T> {
	private T data;
	private ErrorDTO error;
	private String message;
	private boolean success;
	public ResponseBody() {
		super();
	}
	public ResponseBody(T data, ErrorDTO error, String message, boolean success) {
		super();
		this.data = data;
		this.error = error;
		this.message = message;
		this.success = success;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ErrorDTO getError() {
		return error;
	}
	public void setError(ErrorDTO error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "ResponseBody [data=" + data + ", error=" + error + ", message=" + message + ", success=" + success
				+ "]";
	}
	
	

}

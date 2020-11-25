package com.mindtree.ticketbooking.dto;

public class LogInDto {
	private String email;
	private String password;
	public LogInDto() {
		super();
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

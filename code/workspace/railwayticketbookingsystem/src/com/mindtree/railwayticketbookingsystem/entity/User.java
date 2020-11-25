package com.mindtree.railwayticketbookingsystem.entity;

public class User {
	private int userId;
	private String userName;
	private int trainId;
	private float fare;
	public User() {
		super();
	}
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public User(int userId, String userName,int trainId,float fare) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.trainId=trainId;
		this.fare=fare;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", trainId=" + trainId + ", fare=" + fare + "]";
	}
	
}

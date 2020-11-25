package com.mindtree.trainbookingsystem.entity;

public class User {
	private int userId;
	private String userName;
	private int trainId;
	private float fare;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public User(int uId, String uName, int tId, float fare) {
		this.userId=uId;
		this.userName=uName;
		this.trainId=tId;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", trainId=" + trainId + ", fare=" + fare + "]";
	}
	
	
}

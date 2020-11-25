package com.mindtree.hotelmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.PERSIST,mappedBy="user")
	List<Hotel> hotel;

	public User() {
		super();
	}

	public User(String userName, List<Hotel> hotel) {
		super();
		this.userName = userName;
		this.hotel = hotel;
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

	public List<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", hotel=" + hotel + "]";
	}
}

package com.mindtree.hotelmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelId;
	private String hotelName;
	private int noOfRooms;
	private double amount;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private User user;

	public Hotel() {
		super();
	}

	public Hotel(String hotelName, int noOfRooms, double amount, User user) {
		super();
		this.hotelName = hotelName;
		this.noOfRooms = noOfRooms;
		this.amount = amount;
		this.user = user;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", noOfRooms=" + noOfRooms + ", amount="
				+ amount + ", user=" + user + "]";
	}
}

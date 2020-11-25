package com.mindtree.booking.entity;

public class Booking {
	private int bookingId;
	private String name;
	private String source;
	private String destination;
	private float distance;
	private float price;
	private int age;
	public Booking() {
		super();
	}
	public Booking(int bookingId, String name, String source, String destination, float distance, float price,
			int age) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.price = price;
		this.age = age;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", distance=" + distance + ", price=" + price + ", age=" + age + "]";
	}
	
	

}

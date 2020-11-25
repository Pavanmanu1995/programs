package com.mindtree.flightBooking.entity;

public class Flight {
	private int flightId;
	private String flightName;
	private float ticketCost;
	public Flight() {
		super();
	}
	public Flight(int flightId, String flightName, float ticketCost) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.ticketCost = ticketCost;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public float getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", ticketCost=" + ticketCost + "]";
	}
	
	
}

package com.mindtree.bookingportal.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.mindtree.bookingportal.entity.MovieTicket;

public class BookingPortalDTO {
	private int bookingPortalId;
	
	@NotNull(message="store name cannot be empty")
	private String bookingPortalName;
	
	private List<MovieTicket> ticketList;

	public BookingPortalDTO() {
		super();
	}

	public BookingPortalDTO(int bookingPortalId,
			@NotNull(message = "store name cannot be empty") String bookingPortalName, List<MovieTicket> ticketList) {
		super();
		this.bookingPortalId = bookingPortalId;
		this.bookingPortalName = bookingPortalName;
		this.ticketList = ticketList;
	}

	public int getBookingPortalId() {
		return bookingPortalId;
	}

	public void setBookingPortalId(int bookingPortalId) {
		this.bookingPortalId = bookingPortalId;
	}

	public String getBookingPortalName() {
		return bookingPortalName;
	}

	public void setBookingPortalName(String bookingPortalName) {
		this.bookingPortalName = bookingPortalName;
	}

	public List<MovieTicket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<MovieTicket> ticketList) {
		this.ticketList = ticketList;
	}

	@Override
	public String toString() {
		return "BookingPortalDTO [bookingPortalId=" + bookingPortalId + ", bookingPortalName=" + bookingPortalName
				+ ", ticketList=" + ticketList + "]";
	}
	
	


}

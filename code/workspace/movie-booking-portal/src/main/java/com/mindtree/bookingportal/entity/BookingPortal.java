package com.mindtree.bookingportal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "bookingportal")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookingPortalId")
public class BookingPortal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingportal_Id")
	private int bookingPortalId;
	
	@Column(name = "bookingportal_Name")
	private String bookingPortalName;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "bookingPortal")
	@JsonIgnoreProperties("bookingPortal")
	private List<MovieTicket> ticketList;

	public BookingPortal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BookingPortal(int bookingPortalId, String bookingPortalName, List<MovieTicket> ticketList) {
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

	
	
	
}

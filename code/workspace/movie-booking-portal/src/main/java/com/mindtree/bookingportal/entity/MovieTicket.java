package com.mindtree.bookingportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movieticket")
public class MovieTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_Id")
	private int ticketId;
	
	@Column(name = "ticket_Name")
	private String movieName;
	
	@Column(name = "ticket_price")
	private float price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookingPortalId")
	private BookingPortal bookingPortal;

	public MovieTicket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MovieTicket(int ticketId, String movieName, float price, BookingPortal bookingPortal) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.price = price;
		this.bookingPortal = bookingPortal;
	}


	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public BookingPortal getBookingPortal() {
		return bookingPortal;
	}

	public void setBookingPortal(BookingPortal bookingPortal) {
		this.bookingPortal = bookingPortal;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}

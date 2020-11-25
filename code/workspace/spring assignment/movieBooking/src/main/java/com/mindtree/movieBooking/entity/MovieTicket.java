package com.mindtree.movieBooking.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="movie_ticket")
public class MovieTicket implements Comparable<MovieTicket>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -262532022920063146L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Movie_Ticket_Id")
	private long movieTicketId;

	@Column(name = "Movie_Name")
	private String movieName;

	@Column(name = "Movie_Ticket_Price")
	private double ticketPrice;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnore
	private BookingPortal bookingPortal;

	public MovieTicket() {
		// TODO Auto-generated constructor stub
	}

	public MovieTicket(String movieName, double ticketPrice, BookingPortal bookingPortal) {
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.bookingPortal = bookingPortal;
	}
	

	public MovieTicket(long movieTicketId, String movieName, double ticketPrice) {
		super();
		this.movieTicketId = movieTicketId;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public BookingPortal getBookingPortal() {
		return bookingPortal;
	}

	public void setBookingPortal(BookingPortal bookingPortal) {
		this.bookingPortal = bookingPortal;
	}

	public long getMovieTicketId() {
		return movieTicketId;
	}

	@Override
	public int compareTo(MovieTicket mt) {
		return (int) (this.getMovieTicketId() - mt.getMovieTicketId());
	}

}

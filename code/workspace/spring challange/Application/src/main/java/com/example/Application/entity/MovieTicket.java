package com.example.Application.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class MovieTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private double ticketPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "portalId")
//	@JsonIgnore // cascade=CascadeType.ALL,mappedBy="movieTicket")
	private BookingPortal bookingPortal;

	public MovieTicket() {
		super();
	}

	public MovieTicket(String movieName, double ticketPrice, BookingPortal bookingPortal) {
		super();
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.bookingPortal = bookingPortal;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
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

//	@Override
//	public String toString() {
//		return "MovieTicket [movieId=" + movieId + ", movieName=" + movieName + ", ticketPrice=" + ticketPrice
//				+ ", bookingPortal=" + bookingPortal + "]";
//	}

}

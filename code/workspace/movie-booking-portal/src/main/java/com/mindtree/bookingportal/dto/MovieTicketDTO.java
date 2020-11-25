package com.mindtree.bookingportal.dto;

import javax.validation.constraints.NotNull;

import com.mindtree.bookingportal.entity.BookingPortal;

public class MovieTicketDTO {
	
	private int ticketId;
	
	@NotNull(message="movie name cannot be empty")
	private String movieName;
	
	@NotNull(message="price cannot be empty")
	private float price;
	
	private BookingPortal bookingPortal;
	
	public MovieTicketDTO() {
		super();
	}

	public MovieTicketDTO(int ticketId, @NotNull(message = "movie name cannot be empty") String movieName,
			@NotNull(message = "price cannot be empty") float price, BookingPortal bookingPortal) {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public BookingPortal getBookingPortal() {
		return bookingPortal;
	}

	public void setBookingPortal(BookingPortal bookingPortal) {
		this.bookingPortal = bookingPortal;
	}

	@Override
	public String toString() {
		return "MovieTicketDTO [ticketId=" + ticketId + ", movieName=" + movieName + ", price=" + price
				+ ", bookingPortal=" + bookingPortal + "]";
	}
	
	
	
	

}

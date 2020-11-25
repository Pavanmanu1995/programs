package com.mindtree.movieBooking.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.mindtree.movieBooking.entity.MovieTicket;

public class BookingPortalDTO implements Comparable<BookingPortalDTO>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2214448022064518837L;

	private long porttalId;

	@NotNull(message = "Store Name Cannot Be Empty")
	private String portalName;

	private List<MovieTicket> movieTicket;

	public BookingPortalDTO() {
	}

	public BookingPortalDTO(long porttalId, String portalName, List<MovieTicket> movieTicket) {
		this.porttalId = porttalId;
		this.portalName = portalName;
		this.movieTicket = movieTicket;
	}

	public long getPorttalId() {
		return porttalId;
	}

	public void setPorttalId(long porttalId) {
		this.porttalId = porttalId;
	}

	public String getPortalName() {
		return portalName;
	}

	public void setPortalName(String portalName) {
		this.portalName = portalName;
	}

	public List<MovieTicket> getMovieTicket() {
		return movieTicket;
	}

	public void setMovieTicket(List<MovieTicket> movieTicket) {
		this.movieTicket = movieTicket;
	}

	@Override
	public int compareTo(BookingPortalDTO bp) {
		// TODO Auto-generated method stub
		return (int) (this.getPorttalId() - bp.getPorttalId()) ;
	}

}

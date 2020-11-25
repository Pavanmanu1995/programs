package com.mindtree.movieBooking.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="booking_portal")
public class BookingPortal implements Comparable<BookingPortal>,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8537280087989770032L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Portal_Id")
	private long porttalId;

	@Column(name = "Portal_Name")
	private String portalName;

	@OneToMany(mappedBy = "bookingPortal", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("bookingPortal")
	private List<MovieTicket> movieTicket;

	public BookingPortal() {
	
	}

	public BookingPortal(String portalName, List<MovieTicket> movieTicket) {
		this.portalName = portalName;
		this.movieTicket = movieTicket;
	}
	

	public BookingPortal(long porttalId, String portalName) {
		super();
		this.porttalId = porttalId;
		this.portalName = portalName;
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

	public long getPorttalId() {
		return porttalId;
	}

	@Override
	public int compareTo(BookingPortal bp) {
		return (int) (this.getPorttalId() - bp.getPorttalId());
	}

}

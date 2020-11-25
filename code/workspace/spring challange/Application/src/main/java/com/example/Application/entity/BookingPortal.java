package com.example.Application.entity;

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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property ="portalId")
public class BookingPortal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int portalId;
	
	@Column
	private String portalName;

	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER,mappedBy = "bookingPortal")
	List<MovieTicket> movieTicket;

	public BookingPortal() {
		super();
	}

	public BookingPortal(String portalName, List<MovieTicket> movieTicket) {
		super();
		// this.portalId = portalId;
		this.portalName = portalName;
		this.movieTicket = movieTicket;
	}

	public int getPortalId() {
		return portalId;
	}

	public void setPortalId(int portalId) {
		this.portalId = portalId;
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

}

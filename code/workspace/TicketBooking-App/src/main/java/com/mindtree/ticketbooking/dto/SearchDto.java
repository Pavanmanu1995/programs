package com.mindtree.ticketbooking.dto;

public class SearchDto {
	private String source;
	private String destination;

	public SearchDto() {
		super();
		
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}

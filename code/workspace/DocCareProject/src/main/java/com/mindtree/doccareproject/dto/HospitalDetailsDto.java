package com.mindtree.doccareproject.dto;

public class HospitalDetailsDto {

	private String hospitalAddress;
	private double hospitalrevenue;

	public double getHospitalrevenue() {
		return hospitalrevenue;
	}

	public void setHospitalrevenue(double hospitalrevenue) {
		this.hospitalrevenue = hospitalrevenue;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

}

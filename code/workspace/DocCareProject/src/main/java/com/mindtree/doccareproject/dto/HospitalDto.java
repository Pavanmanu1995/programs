package com.mindtree.doccareproject.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.mindtree.doccareproject.entity.Doctor;

public class HospitalDto {

	private int hospitalId;

	@Size(min = 3, message = "Name length should be greater than 3")
	private String hospitalName;

	@Size(min = 3, message = "Addresss length should be greater than 3")
	private String hospitalAddress;

	@Min(value = 10000, message = "Doctor Salary Must Above 1000")
	private double hospitalRevenue;

	List<Doctor> doctors;

	public HospitalDto() {
		// TODO Auto-generated constructor stub
	}

	public HospitalDto(int hospitalId, String hospitalName, String hospitalAddress, double hospitalRevenue,
			List<Doctor> doctors) {
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalRevenue = hospitalRevenue;
		this.doctors = doctors;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public double getHospitalRevenue() {
		return hospitalRevenue;
	}

	public void setHospitalRevenue(double hospitalRevenue) {
		this.hospitalRevenue = hospitalRevenue;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

}

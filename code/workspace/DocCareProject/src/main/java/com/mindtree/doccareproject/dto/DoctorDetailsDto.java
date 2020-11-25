package com.mindtree.doccareproject.dto;

import com.mindtree.doccareproject.entity.DoctorsSpecialty;

public class DoctorDetailsDto {

	private int doctorId;

	private String doctorName;

	private String doctorAddress;

	private double doctorSalary;

	private DoctorsSpecialty doctorsSpecialty;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public double getDoctorSalary() {
		return doctorSalary;
	}

	public void setDoctorSalary(double doctorSalary) {
		this.doctorSalary = doctorSalary;
	}

	public DoctorsSpecialty getDoctorsSpecialty() {
		return doctorsSpecialty;
	}

	public void setDoctorsSpecialty(DoctorsSpecialty doctorsSpecialty) {
		this.doctorsSpecialty = doctorsSpecialty;
	}

}

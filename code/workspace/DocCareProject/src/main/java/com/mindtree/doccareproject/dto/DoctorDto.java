package com.mindtree.doccareproject.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.mindtree.doccareproject.entity.DoctorsSpecialty;
import com.mindtree.doccareproject.entity.Hospital;

public class DoctorDto {

	private int doctorId;

	@Size(min = 3, message = "Name length should be greater than 3")
	private String doctorName;

	@Size(min = 3, message = "Doctor Address length should be greater than 3")
	private String doctorAddress;

	@Size(min = 1, message = "age can not be less than 1")
	private int doctorAge;

	@Min(value = 1000, message = "Doctor Salary Must Above 1000")
	@Max(value = 100000, message = "Doctor Salary Must Be Below 100000")
	private double doctorSalary;

	@NotBlank(message = "Doctors Specialty Be Blank")
	private DoctorsSpecialty doctorsSpecialty;

	Hospital hospital;

	public DoctorDto() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDto(int doctorId, String doctorName, String doctorAddress, int doctorAge, double doctorSalary,
			DoctorsSpecialty doctorsSpecialty, Hospital hospital) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.doctorAge = doctorAge;
		this.doctorSalary = doctorSalary;
		this.doctorsSpecialty = doctorsSpecialty;
		this.hospital = hospital;
	}

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

	public int getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
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

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}

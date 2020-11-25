package com.mindtree.doccareproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Docter")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctorId")
	private int doctorId;

	@Column(name = "doctorName", nullable = false)
	private String doctorName;

	@Column(name = "doctorAddress", nullable = false)
	private String doctorAddress;

	@Column(name = "doctorAge", nullable = false)
	private int doctorAge;

	@Column(name = "doctorSalary", nullable = false)
	private double doctorSalary;

	@Column(name = "doctorsSpecialty")
	private DoctorsSpecialty doctorsSpecialty;

	@JsonIgnore
	@ManyToOne
	Hospital hospital;

	public Doctor() {

		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorId, String doctorName, String doctorAddress, int doctorAge, double doctorSalary,
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

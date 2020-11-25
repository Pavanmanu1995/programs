package com.mindtree.doccareproject.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital")
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hospitlid")
	private int hospitalId;

	@Column(name = "hospitlName", nullable = false)
	private String hospitalName;

	@Column(name = "hospitalAddress", nullable = false)
	private String hospitalAddress;

	@Column(name = "hospitalRevenue", nullable = false)
	private double hospitalRevenue;

	@OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
	List<Doctor> doctors;

	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	public Hospital(int hospitalId, String hospitalName, String hospitalAddress, double hospitalRevenue,
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

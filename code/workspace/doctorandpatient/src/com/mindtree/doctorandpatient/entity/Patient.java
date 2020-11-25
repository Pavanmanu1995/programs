package com.mindtree.doctorandpatient.entity;

public class Patient {
	private int doctorId;
	private int patientId;
	private String patientname;
	private double billAmount;
	public Patient() {
		super();
	}
	public Patient(int doctorId, int patientId, String patientname, double billAmount) {
		super();
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.patientname = patientname;
		this.billAmount = billAmount;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Patient [doctorId=" + doctorId + ", patientId=" + patientId + ", patientname=" + patientname
				+ ", billAmount=" + billAmount + "]";
	}
	

}

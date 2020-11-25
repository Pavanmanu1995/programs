package com.mindtree.doctorandpatient.entity;

public class Doctor {
private int doctorId;
private String doctorName;
private int yearOfExprience;
public Doctor() {
	super();
}
public Doctor(int doctorId, String doctorName, int yearOfExprience) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.yearOfExprience = yearOfExprience;
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
public int getYearOfExprience() {
	return yearOfExprience;
}
public void setYearOfExprience(int yearOfExprience) {
	this.yearOfExprience = yearOfExprience;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", yearOfExprience=" + yearOfExprience + "]";
}

}

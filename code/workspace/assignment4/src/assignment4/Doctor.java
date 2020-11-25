package assignment4;

public class Doctor {
	int doctorId;
	String doctorName;
	double salary;
	Patient patient[];
	public Doctor(int doctorId, String doctorName, double salary, Patient[] patient) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.salary = salary;
		this.patient = patient;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Patient[] getPatient() {
		return patient;
	}
	public void setPatient(Patient[] patient) {
		this.patient = patient;
	}
	

}

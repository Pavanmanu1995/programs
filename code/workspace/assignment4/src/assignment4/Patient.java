package assignment4;

public class Patient {
	int patientId;
	String patientName;
	double patientBill;
	public Patient(int patientId, String patientName, double patientBill) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientBill = patientBill;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public double getPatientBill() {
		return patientBill;
	}
	public void setPatientBill(double patientBill) {
		this.patientBill = patientBill;
	}
	
	

}

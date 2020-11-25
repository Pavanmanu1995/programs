package entity;

public class Person {
	private int personID;
	private String personName;
	private String address;
	private long mobileNumber;
	private long aadharNumber;
	public Person() {
		super();
	}
	public Person(int personID, String personName, String address, long mobileNumber, long aadharNumber) {
		this.personID = personID;
		this.personName = personName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.aadharNumber = aadharNumber;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	

}

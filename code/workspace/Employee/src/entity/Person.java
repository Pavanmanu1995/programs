package entity;

public class Person {
	
	private int personID;
	private String personName;
	private long mobNuber;
	public Person() {
		super();
	}
	public Person(int personID, String personName, long mobNuber) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.mobNuber = mobNuber;
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
	public long getMobNuber() {
		return mobNuber;
	}
	public void setMobNuber(long mobNuber) {
		this.mobNuber = mobNuber;
	}
	
	

}

package com.mindtree.flightBooking.entity;

public class Person {
	private int personId;
	private String personName;
	private float accountBalance;
	public Person() {
		super();
	}
	public Person(int personId, String personName, float accountBalance) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.accountBalance = accountBalance;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", accountBalance=" + accountBalance
				+ "]";
	}
	

}

package service;

import entity.Person;

public class PersonImpl implements IPerson {

	@Override
	public Person getPerson() {
		System.out.println("get person");
		return null;
	}

	@Override
	public Person addPerson() {
		System.out.println("add person");
		return null;
	}

	@Override
	public void deletePerson() {
		System.out.println("delete person");

	}

}

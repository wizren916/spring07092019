package com.fsa.example;

public class PersonFactory {
	public Person createPerson(int id, String name) {
		System.out.println("Factory method in factory class");
		return new Person(id, name);
	}
}

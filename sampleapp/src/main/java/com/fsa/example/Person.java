package com.fsa.example;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Hello World!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void onCreate() {
		System.out.println("OnCreate called from Person: " + this);
	}

	public void onDestroy() {
		System.out.println("OnDestroy called from Person: " + this);
	}

	public static Person getInstance(int id, String name) {
		System.out.println("Factory method in person");
		return new Person(id, name);
	}
}

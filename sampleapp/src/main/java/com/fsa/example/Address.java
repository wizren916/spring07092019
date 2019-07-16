package com.fsa.example;

public class Address {
	private String street;
	private int postcode;
	
	public Address() {
	}

	public Address(String street, int postcode) {
		this.street = street;
		this.postcode = postcode;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	public void init() {
		System.out.println("Deafult init called from Address: " + this);
	}
	
	public void destroy() {
		System.out.println("Deafult destroy called from Address: " + this);
	}
}

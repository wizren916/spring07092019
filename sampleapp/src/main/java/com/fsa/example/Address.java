package com.fsa.example;

public class Address {
	private String street;
	private int postcode;

	public Address(String street, int postcode) {
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
}

package com.prowingserialization;

import java.io.Serializable;

public class Adress implements Serializable {
	int pin;
	String city;
	Street street;
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(int pin, String city, Street street) {
		super();
		this.pin = pin;
		this.city = city;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Adress [pin=" + pin + ", city=" + city + ", street=" + street + "]";
	}

}

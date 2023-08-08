package com.prowingserialization;

import java.io.Serializable;

public class Street implements Serializable {
	String name;
	int no;
	public Street(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	public Street() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Street [name=" + name + ", no=" + no + "]";
	}

}

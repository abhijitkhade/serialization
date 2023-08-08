package com.prowingserialization;

import java.io.Serializable;

public class Studentstatic implements Serializable {
	
	static final String name="khade";
	static final int roll = 10;
	
	
	@Override
	public String toString() {
		return "StudentTransient [name=" + name + "]";
	}
	public Studentstatic(String name) {
		super();
	//	this.name = name;
	}
	public Studentstatic() {
		super();
		// TODO Auto-generated constructor stub
	}

}

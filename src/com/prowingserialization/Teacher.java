package com.prowingserialization;

import java.io.Serializable;

public class Teacher implements Serializable {
	
	String name;
	int id;
	String Subject;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int id, String subject) {
		super();
		this.name = name;
		this.id = id;
		Subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", Subject=" + Subject + "]";
	}
	
	

}

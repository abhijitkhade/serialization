package com.prowingserialization;

import java.io.Serializable;

public class PersonHas implements Serializable {
	int id;
	String name;
	Adress adress;
	public PersonHas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonHas(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "PersonHas [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}

}

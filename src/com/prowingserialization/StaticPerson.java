package com.prowingserialization;

import java.io.Serializable;

public class StaticPerson implements Serializable {
	
    int id;
    int mob;
    transient final String name="abhikhade";
  //  transient final String name;
  //  String name;
    
	public StaticPerson() {
		super();
		//this.name = "khadeAbhi";
	}
	
	public StaticPerson(int id, int mob,String name) {
		super();
	//	this.name = name;
		this.id = id;
		this.mob = mob;
	//	this.name=name;
	}
	@Override
	public String toString() {
		return "StaticPerson [id=" + id + ", mob=" + mob + ",name="+name+"]";
	}
    
    

}

package com.prowingserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserCustom implements Serializable {
	
	int id;
	String username;
	 transient String passward;
	public UserCustom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserCustom(int id, String username, String passward) {
		super();
		this.id = id;
		this.username = username;
		this.passward = passward;
	}
	@Override
	public String toString() {
		return "UserCustom [id=" + id + ", username=" + username + ", passward=" + passward + "]";
	}
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		System.out.println(" my write object method invoked ");
		
		oos.defaultWriteObject();
		String epwd= "123"+passward;
		oos.writeObject(epwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		
		ois.defaultReadObject();
		
		String epwd= (String) ois.readObject();
		
		passward= epwd.substring(2);
	}

}

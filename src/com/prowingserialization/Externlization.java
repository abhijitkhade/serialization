package com.prowingserialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externlization implements Externalizable {
	
	int id;
	String name;
	//Serial version UID= 1L;
	public Externlization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Externlization(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Externlization [id=" + id + ", name=" + name + "]";
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(id);
		out.writeObject(name);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id= in.read();
		name= (String) in.readObject();
		
		
	}

}

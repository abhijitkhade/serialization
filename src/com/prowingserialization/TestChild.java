package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestChild {
	
	public static void main(String[] args) {
		
		
		Subclass object = new Subclass(20);
		
		try {
			FileOutputStream file= new FileOutputStream("child.ser");
			ObjectOutputStream obj= new ObjectOutputStream(file);
			obj.writeObject(object);
			System.out.println("serialise sucefully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

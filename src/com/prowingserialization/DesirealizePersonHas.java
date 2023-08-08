package com.prowingserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesirealizePersonHas {
	public static void main(String[] args) {
		
	
	try {
		
	
	
	FileInputStream file= new FileInputStream("personhas.src");
	ObjectInputStream obj= new ObjectInputStream(file);
	
	 PersonHas desiperson=(PersonHas) obj.readObject();
	 System.out.println(desiperson);
	}
	catch(Exception e) {
		System.out.println("deserialise person");
	}

}
}

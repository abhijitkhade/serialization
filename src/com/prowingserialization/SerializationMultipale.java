package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationMultipale {
	
	public static void main(String[] args) {
		
		Teacher t1= new Teacher("jaan", 123, "maths");
		
		Student s1= new Student(10, "abhi");
		
	
	
	try {
		
		FileOutputStream file= new FileOutputStream("manyObjects.ser");
		ObjectOutputStream obj= new ObjectOutputStream(file);
		
		obj.writeObject(t1);
		obj.writeObject(s1);
		
		System.out.println("serialize both object");
	}
	catch(Exception e) {
		System.out.println("exception in seralozation");
	}
	

}
}
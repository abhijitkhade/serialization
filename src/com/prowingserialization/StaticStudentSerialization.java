package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticStudentSerialization  {
	
	public static void main(String[] args) {
		
		Studentstatic st= new Studentstatic("abhi"); 
		
		try {
		
		FileOutputStream file= new FileOutputStream("student.src");
		ObjectOutputStream obj= new ObjectOutputStream(file);
		
		obj.writeObject(st);
		
		System.out.println("serialize sucefully");
		}
		
		catch(Exception e) {
			System.out.println("exception in serialization");
		}
		
	}
	

}

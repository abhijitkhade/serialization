package com.prowingserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class DeserializationStudent {
	
	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream file= new FileInputStream("student.ser");
			
			ObjectInputStream in= new ObjectInputStream(file);
			
			Student deseralizedobj= (Student) in.readObject();
			
			System.out.println(deseralizedobj);
		}
		
	 catch (Exception e) {

		System.out.println("exception while deserializing stream... ");
		e.printStackTrace();
	}


	}

}

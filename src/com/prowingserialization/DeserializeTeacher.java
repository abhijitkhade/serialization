package com.prowingserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeTeacher {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream file= new FileInputStream("abhi.ser");
			
			ObjectInputStream obj= new ObjectInputStream(file);
			
			 Teacher DeTeacher=(Teacher) obj.readObject();
			 
			 System.out.println(DeTeacher);
		}
		
		catch(Exception e) {
			System.out.println("exception");
			
			e.printStackTrace();
		}
		
		
		
	}

}

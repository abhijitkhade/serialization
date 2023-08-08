package com.prowingserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaticStudentDesiralization {
	
	public static void main(String[] args) {
		 
		try {
			FileInputStream file= new FileInputStream("student.src");
					
			ObjectInputStream obj= new ObjectInputStream(file);	
			
			
			 Studentstatic stde1= (Studentstatic) obj.readObject();
			
			System.out.println(stde1);
		}
		catch(Exception e) {
			System.out.println("Exception in desirealize");
			
			e.printStackTrace();
		}
	}

}

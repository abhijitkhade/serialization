package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationStudent {
	
	public static void main(String[] args) {
		
		Student s1= new Student(10, "abhi");
		
		
		 try
	        {  
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream("student.ser");
	            ObjectOutputStream out = new ObjectOutputStream(file);

	            // Method for serialization of object
	            out.writeObject(s1);
	            
	            System.out.println("object serialized successfully!!");
	        }
		 catch (Exception e) {
			 System.out.println("exception while serializing the object!!    :  "+e.getMessage());
			 e.printStackTrace();
		}
	}


		
			
	}



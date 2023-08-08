package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTeacher{
	
	public static void main(String[] args) {
		
		
		Teacher t1= new Teacher("aaa", 20, "marathi");
		
		try {
			FileOutputStream file= new FileOutputStream("abhi.ser");
			
			ObjectOutputStream obj= new ObjectOutputStream(file);
			
			obj.writeObject(t1);
			
			System.out.println("serialize sucefully");
		}
		
		 catch (Exception e) {
			 System.out.println("exception while serializing the objects!!    :  "+e.getMessage());
			 e.printStackTrace();
		}
			
		}
	}


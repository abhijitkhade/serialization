package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStaticperson {
	
	public static void main(String[] args) {
		
		StaticPerson s1= new StaticPerson(15, 25,"abhijit");
		
		try {
			FileOutputStream file= new FileOutputStream("person.src");
			
			ObjectOutputStream obj= new ObjectOutputStream(file);
			
			obj.writeObject(s1);
			
			System.out.println("serialize sucefully");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}

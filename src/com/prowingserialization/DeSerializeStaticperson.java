package com.prowingserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeStaticperson {
	
	public static void main(String[] args) {
		 
		try {
			FileInputStream file= new FileInputStream("person.src");
			ObjectInputStream obj= new ObjectInputStream(file);
			
			StaticPerson deStaticPerson=(StaticPerson) obj.readObject();
			
			System.out.println(deStaticPerson);
			
			//System.out.println(deStaticPerson.name);
		}
			
			catch(Exception e) {
				
			
			e.printStackTrace();
		}
	}

}

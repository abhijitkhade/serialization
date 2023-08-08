package com.prowingserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialiseAgregationPerson {
	
	public static void main(String[] args) {
		
		Street st= new Street("MGRoad", 007);
		
		Adress ad= new Adress(123, "pune", st);
		
		PersonHas per = new PersonHas(777, "Abhi", ad);
		
		try {
			FileOutputStream file= new FileOutputStream("personhas.src");
			ObjectOutputStream obj= new ObjectOutputStream(file);
			obj.writeObject(per);
			System.out.println("person serialise sucefully");
		}
		catch(Exception e ) {
			System.out.println("exception in Serialization");
			e.printStackTrace();
			
		}
		
	}
    
}

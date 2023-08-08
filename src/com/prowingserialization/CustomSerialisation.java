package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomSerialisation {
	
	public static void main(String[] args) {
		UserCustom usr= new UserCustom(777, "msdhoni", "abhi@1234");
		 
		try {
			FileOutputStream file =new FileOutputStream("custom.src");
			ObjectOutputStream obj= new ObjectOutputStream(file);
			obj.writeObject(usr);
			System.out.println("user serialise sucefully");
		}
		catch( Exception e) {
		System.out.println("exception serialization");
		e.printStackTrace();
	}

}
}
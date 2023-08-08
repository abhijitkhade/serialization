package com.prowingserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class DeserialiseExternalise {
	
	public static void main(String[] args) {
		
		
		
		try {
			FileInputStream file= new FileInputStream("external scr");
			ObjectInputStream in= new ObjectInputStream(file);
			
			Externlization deExternlization= (Externlization) in.readObject();
			System.out.println(deExternlization);
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

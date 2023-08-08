package com.prowingserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialiseUser {
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("custom.src");
			ObjectInputStream obj= new ObjectInputStream(file);
			
			 UserCustom deserializedUser = (UserCustom) obj.readObject();
			 System.out.println(deserializedUser);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

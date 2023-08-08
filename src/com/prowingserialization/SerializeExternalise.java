package com.prowingserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExternalise {
	public static void main(String[] args) {
		Externlization ex= new Externlization(10, "nayan");
		
		try {
			FileOutputStream file= new FileOutputStream("external scr");
			ObjectOutputStream out= new ObjectOutputStream(file);
			
			
			out.writeObject(ex);
			System.out.println("serialise sucefully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

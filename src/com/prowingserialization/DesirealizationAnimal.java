package com.prowingserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesirealizationAnimal {
	
	
	public static void main(String[] args) {


		try {
			 FileInputStream file = new FileInputStream("dog.ser");

			 ObjectInputStream in = new ObjectInputStream(file);


			 Dog deserializedDog = (Dog) in.readObject();


			 System.out.println(deserializedDog);

		} catch (Exception e) {

			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}

	}

}

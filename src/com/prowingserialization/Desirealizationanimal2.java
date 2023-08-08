package com.prowingserialization;

import java.io.FileInputStream;
		import java.io.ObjectInputStream;

		public class Desirealizationanimal2 {
			
			
			public static void main(String[] args) {


				try {
					 FileInputStream file = new FileInputStream("horse.ser");

					 ObjectInputStream in = new ObjectInputStream(file);


					 Horse deserializedhorse = (Horse) in.readObject();


					 System.out.println(deserializedhorse);

				} catch (Exception e) {

					System.out.println("exception while deserializing stream... ");
					e.printStackTrace();
				}

			}

		}







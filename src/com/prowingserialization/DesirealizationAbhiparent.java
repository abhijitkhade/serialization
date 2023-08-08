package com.prowingserialization;
import java.io.FileInputStream;
	import java.io.ObjectInputStream;

	public class DesirealizationAbhiparent {
		
		
		public static void main(String[] args) {


			try {
				 FileInputStream file = new FileInputStream("cat.ser");

				 ObjectInputStream in = new ObjectInputStream(file);


				 Cat deserializedCat = (Cat) in.readObject();


				 System.out.println(deserializedCat);

			} catch (Exception e) {

				System.out.println("exception while deserializing stream... ");
				e.printStackTrace();
			}

		}

	}




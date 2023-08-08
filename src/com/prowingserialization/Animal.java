package com.prowingserialization;

import java.io.Serializable;

public class Animal  implements Serializable  {
	int i=20;
	
	public Animal() {
		super ();
	}

	@Override
	public String toString() {
		return "Animal [i=" + i + "]";
	}

}

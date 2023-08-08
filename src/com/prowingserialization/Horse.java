package com.prowingserialization;

public class Horse extends Animal2 {
	
	 transient int j=55;

	@Override
	public String toString() {
		return "Horse [j=" + j + ", i=" + i + "]";
	}

}

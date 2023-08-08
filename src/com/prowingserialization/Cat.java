package com.prowingserialization;

import java.io.Serializable;

public class Cat extends AbhiParent implements Serializable {
	
	int j= 20;

//	public Cat() {
//		super();
//	}

	public Cat(int i) {
		super(i);
	}

	@Override
	public String toString() {
		return "Cat [j=" + j + ", i=" + i + "]";
	}

}

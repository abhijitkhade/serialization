package com.prowingserialization;

import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

	
	
	
	class Subclass extends InteritanceStop{
		private int id;
		private static final long serialvir=1L;
		

		public Subclass(int id) {
			super();
			this.id = id;
		}
		@Override
		public String toString() {
			return "Subclass [id=" + id + "]";
		}
		private void writeObject(ObjectOutputStream os) throws NotSerializableException{
			System.out.println("my own method");
			
		}
	}




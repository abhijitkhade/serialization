package com.prowingserialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Animal3 implements Externalizable {
	
	int i=20;
		
		public Animal3() {
			super ();
		}

		@Override
		public String toString() {
			return "Animal [i=" + i + "]";
		}

			
		
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
		//	out.write(id);
		//	out.writeObject(name);
		}
		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//	id= in.read();
		//	name= (String) in.readObject();
			
		}

}

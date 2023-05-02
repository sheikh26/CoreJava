package com.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FilePrimitiveDataWrite {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("c:/primitivedata.dat");

		DataOutputStream out = new DataOutputStream(file);

		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.2);

		out.close();
		System.out.println("Primitive Data successfully written");
	}

}

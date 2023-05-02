package com.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class FilePrimitiveDataRead {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("c:/primitivedata.dat");

		DataInputStream in = new DataInputStream(file);

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
	}

}

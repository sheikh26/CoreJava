package com.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFileChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		for (int i = 0; i < 5; i++) {
			writer.write(i + '1');
		}

		writer.close();

		System.out.println("DONE");

	}

}

package com.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		PrintWriter printWriter = new PrintWriter(writer);

		for (int i = 0; i < 5; i++) {
			printWriter.println(i + " : Line");
		}
		
		printWriter.flush();
		
		printWriter.close();
		writer.close();		

		System.out.println("DONE");
		
	}

}

package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteBufferedFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		BufferedWriter printWriter = new BufferedWriter(writer);

		for (int i = 0; i < 5; i++) {
			printWriter.write(i + " : Line\n" );
		}
		
		printWriter.flush();
		
		printWriter.close();
		writer.close();		

		System.out.println("DONE");
		
	}

}

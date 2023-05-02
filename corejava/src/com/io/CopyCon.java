package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String target= "c:/temp.txt";
		
		FileWriter writer = new FileWriter(target);
		
		PrintWriter printWriter = new PrintWriter(writer);

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String line = bufferedReader.readLine();
		
		while (!line.equals("quit")) {

			printWriter.println(line);
			line = bufferedReader.readLine();
		}
		
		printWriter.close();
		inputStreamReader.close();

	}

}

package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyText {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		String source= "D:/IOFilesFolder/newtest.txt";
		String target = "D:/IOFilesFolder/newtest1.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read() ;
		
		while (ch != -1){
			writer.write(ch);
			ch = reader.read();
		}
		
		writer.close();
		reader.close();
		System.out.println(source + " is copied to "+ target);

	}

}

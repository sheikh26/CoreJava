package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBin {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		String source= "D:/IOFilesFolder/java logo.PNG";
		String target = "D:/IOFilesFolder/java logo1.PNG";	
		
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		
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

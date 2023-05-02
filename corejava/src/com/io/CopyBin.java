package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBin {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		String source= "c:/IMG_0046.JPG";
		String target = "c:/baby.jpg";
		
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

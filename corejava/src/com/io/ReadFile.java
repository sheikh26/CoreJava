package com.io;

import java.io.FileReader;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileReader reader = new FileReader("c:/test.txt");
		
		int ch = reader.read();
		char chr;
		
		while(ch != -1){
			
			chr = (char)ch;
			System.out.print(  chr);
			ch = reader.read();
		}
		
		

	}

}

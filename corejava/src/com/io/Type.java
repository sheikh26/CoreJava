package com.io;

import java.io.FileReader;

public class Type {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileReader reader = new FileReader(args[0]);
		
		int ch = reader.read();
		char chr;
		
		while(ch != -1){
			
			chr = (char)ch;
			System.out.print(  chr);
			ch = reader.read();
		}
		
		

	}

}

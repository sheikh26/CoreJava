package com.io;

import java.io.FileReader;
import java.io.IOException;

public class CharCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileReader in = new FileReader("xanadu.txt");
		
		int cr = 'e';
		
		int count = 0;
		
        int c = 0;
        while ((c = in.read()) != -1) {
            if(c==cr) {
            	count++;
            }
        }		
		
		System.out.println("Count is : " + count);
	}

}

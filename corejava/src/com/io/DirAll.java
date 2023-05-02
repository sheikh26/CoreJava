package com.io;

import java.io.File;
import java.util.List;

public class DirAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File directory = new File("C:/temp");
		String[] list = directory.list();
		
		for (int i = 0; i < list.length; i++) {
			
			
			
			System.out.println((i + 1) + " : " + list[i]);
		}
	}

}

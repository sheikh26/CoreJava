package com.io;

import java.io.*;



public class Narendra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("c:/narendra.txt");
		FileWriter out;

		try {
			out = new FileWriter(f);
			out.write('A');
			out.close();
		} catch (Exception e) {

		}

	}

}

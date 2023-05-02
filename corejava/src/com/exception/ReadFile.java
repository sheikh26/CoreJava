package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileReader reader = new FileReader("c:/test.txt");

			int ch = reader.read();
			char chr;

			while (ch != -1) {

				chr = (char) ch;
				System.out.print(chr);
				ch = reader.read();
			}

		} catch (FileNotFoundException e) {

			System.out.println("File does not Exist");

		} catch (IOException e) {

			System.out.println("File does not Exist");

		}

	}

}

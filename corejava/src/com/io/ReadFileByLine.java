package com.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileByLine {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("c:/test.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line = bufferedReader.readLine();

		while (line != null) {

			System.out.println(line);
			line = bufferedReader.readLine();
		}

	}
}

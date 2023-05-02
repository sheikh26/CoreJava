package com.io;

import java.io.File;
import java.util.List;

public class DirFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File directory = new File("C:/temp");
		File[] list = directory.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println((i + 1) + " : " + list[i].getName());
			}
		}
	}

}

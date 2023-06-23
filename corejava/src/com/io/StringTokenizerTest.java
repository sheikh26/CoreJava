package com.io;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String str = "Arif,Asif,Arif,aaaa,Michel";

		StringTokenizer stn = new StringTokenizer(str, ",");

		String token = null;

		int count = 0;

		while (stn.hasMoreElements()) {
			token = stn.nextToken();
			/*
			 * if ("Arif".equals(token)) { count++; }
			 */
			System.out.println("StringTokenizer is " + token);
		}
		//System.out.println("Word Count for Michel is " + count);
	}

}

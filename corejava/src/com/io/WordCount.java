package com.io;

import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {

		String str = "Sunil,Sunil,Sunil,aaaa,Sunil";

		StringTokenizer stn = new StringTokenizer(str, ",");

		String token = null;

		int count = 0;

		while (stn.hasMoreElements()) {
			token = stn.nextToken();
			if ("Sunil".equals(token)) {
				count++;
			}
		}
		System.out.println("Word Count for Sunil is " + count);
	}

}

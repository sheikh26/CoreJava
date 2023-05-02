package com.basic;

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Google";
		
		System.out.println(str.indexOf("Google"));
		
		String newStr = str.replace("Google", "Galaxy");
		
		System.out.println(newStr);

	}

}

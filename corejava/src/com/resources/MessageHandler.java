package com.resources;

import java.util.ResourceBundle;

public class MessageHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("com.resources.messages");
		
		String value = rb.getString("database.target");

		System.out.println(value);

	}

}

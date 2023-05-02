package com.net;

import java.net.*;
import java.io.*;

public class URLReader {
	public static void main(String[] args) throws Exception {
		URL yahoo = new URL("http://localhost:8080/jsp-examples/Hello.jsp");
		BufferedReader in = new BufferedReader(new InputStreamReader(yahoo
				.openStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);

		in.close();
	}
}

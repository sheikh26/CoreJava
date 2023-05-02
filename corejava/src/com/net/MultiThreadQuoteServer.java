package com.net;

import java.io.*;

public class MultiThreadQuoteServer {
	public static void main(String[] args) throws IOException {
		new QuoteServerThread().start();
	}
}

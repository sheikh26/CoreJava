package com.servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterPersist extends HttpServlet {
	
	String fileName = "counter.txt";

	int count;

	public void init() {
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String initial = bufferedReader.readLine();
			count = Integer.parseInt(initial);
		} catch (FileNotFoundException e) {
			count = 0;
		} catch (IOException e) {
			count = 0;
		} catch (NumberFormatException e) {
			count = 0;
		}
	}

	// Handle an HTTP GET Request
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		count++;
		out.println("Since loading, this servlet has " + "been accessed "
				+ count + " times.");
		out.close();

	}

	// At Shutdown, store counter back to file
	public void destroy() {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			String countStr = Integer.toString(count);
			fileWriter.write(countStr);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.servlet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Death extends HttpServlet {

	// Handle an HTTP GET Request
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.println("I am alive!");
		out.close();
	}

	// This method is called when one stops
	// the Java Web Server
	public void destroy() {
		try {
			FileWriter fileWriter = new FileWriter("rip.txt");
			Date now = new Date();
			String rip = "I was destroyed at:  " + now.toString();
			fileWriter.write(rip);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Counter extends HttpServlet {

	int count = 0;

	//  Handle an HTTP GET Request
	public void doGet(final HttpServletRequest request, 
	final HttpServletResponse response) throws IOException, ServletException   {
		response.setContentType("text/plain");
		final PrintWriter out = response.getWriter();
		count++;
		out.println ("Since loading, this servlet has "
			+ "been accessed "+ count + " times.");
		out.close();
	}
}

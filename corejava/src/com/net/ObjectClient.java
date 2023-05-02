package com.net;

import java.io.*;
import java.net.*;

import com.dto.Employee;

public class ObjectClient {
	public static void main(String[] args) throws Exception {

		Socket echoSocket = new Socket("127.0.0.1", 4444);

		ObjectOutputStream out = new ObjectOutputStream(echoSocket
				.getOutputStream());

		BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket
				.getInputStream()));

		Employee emp = new Employee(1, "Galaxy", "Technologies");
		emp.setTempValue("8 A Shalimar Corporate");

		out.writeObject(emp);

		String line = in.readLine();

		System.out.println("Received From Server : " + line);

		out.close();
		in.close();
		echoSocket.close();
	}
}
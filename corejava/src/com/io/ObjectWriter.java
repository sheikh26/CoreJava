package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.dto.Employee;

public class ObjectWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fileOutputStream = new FileOutputStream("c:/object.ser");
		

		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

		Employee emp = new Employee(1, "Nikku", "Rathore");
		emp.setTempValue("This is temp value");

		out.writeObject(emp);

		out.close();

		System.out.println("Object successfully persisted");
	}

}

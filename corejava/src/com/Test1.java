package com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Vector;

import com.dto.Employee;

/**
 * Created by IntelliJ IDEA. User: suSheikh Date: Oct 16, 2003 Time: 6:45:28 PM To
 * change this template use Options | File Templates.
 */
public class Test1 {
	public static void main(String[] args) {

		// ArrayList table = new ArrayList();
		Vector table = new Vector();

		table.add("Abhishek");
		table.add("Varsha");
		table.add("Vinod Patil");
		table.add(9);
		table.add("Arif Sheikh");

		// Will store only objects, will not store primitive datatypes

		// Wrapper classes
		// int - java.lang.Integer
		// double - java.lang.Double
		// float - java.lang.Float
		// boolean - java.lang.Boolean

		Integer value = (Integer) table.get(3);

		// String value = (String)table.get(3);

		System.out.println(" Value From ArrayList " + value);

		int size = table.size();

		System.out.println("Size of ArrayList " + size);

		for (int i = 0; i < size; i++) {
			System.out.println("Index  = " + i + " Value " + table.get(i));

		}
		
		System.out.println("**********Iterator **************");
		
		Iterator it = table.iterator();
		
		while(it.hasNext()){
			System.out.println(" Iterator " + it.next());
		}
		
		boolean flag = table.contains("Varsha");
		
		System.out.println("Is Versha there " + flag);
		

	}
}

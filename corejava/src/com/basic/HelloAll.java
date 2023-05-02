package com.basic;

import java.util.ArrayList;
import java.util.Vector;

import com.dto.Employee;

public class HelloAll {
	public static void main(String[] args) {
		String name = "";
		
	
		Employee e = new Employee();

		System.out.println("Hello " + name);
		
		ArrayList v = new ArrayList();
		
		v.add("One");
		v.add("Two");
		v.add("Three");
		
		String temp= (String)v.get(0);
		
		System.out.println(temp);
		
		
		
		
		
	}
}

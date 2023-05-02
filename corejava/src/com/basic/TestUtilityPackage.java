package com.basic;

import java.util.Vector;

import com.dto.Employee;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class TestUtilityPackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		v.add("This is a String");
		Employee e = new Employee();
		v.add(e);
		
		String str = (String)v.get(0);
		Employee emp = (Employee)v.get(1);
		
		System.out.println(str);
		
		Hashtable ht = new Hashtable();
		
		ht.put("userName", str);
		ht.put("role", e);
		
		String str1 = (String)ht.get("userName");
		Employee emp1 = (Employee)ht.get("role");
		
		System.out.println("Hashtable - " + str1);
		System.out.println("Hashtable - " + emp1);		
		
		
		//Vector vs ArrayList
		//Hashtable vs HashMap
		
		
		

	}

}

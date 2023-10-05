package com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.dto.Employee;

/**
 * Created by IntelliJ IDEA. User: suSheikh Date: Oct 16, 2003 Time: 6:45:28 PM To
 * change this template use Options | File Templates.
 */
public class Test {
	public static void main(String[] args) {

		int i = 0;

		int[] table = new int[10];

		i = 9;

		int j = 0;
		
		//Set the value

		for (j = 0; j < 11; j++) {
			table[j] = (j + 1) * 3;

		}

		//Get the value
		for (j = 0; j < 10; j++) {
			System.out.println(" Integer Value is " + table[j]);

		}

	}
}

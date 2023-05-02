package com.basic;

import java.lang.reflect.Method;

public class Person {

	private String name = null;

	private String address = null;
	
	private String city = null;

	private static int AVE_AGE = 60;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAveAge() {
		return AVE_AGE;
	}

	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {

		StringBuffer buffer = new StringBuffer();
		
		Class c = this.getClass();
		
		Method[] ms = c.getMethods();
		
		String mName = null;
		
		for (int i = 0; i < ms.length; i++) {
			
			mName = ms[i].getName();
			if (mName.startsWith("get")) {
				try {
					buffer.append("\n\t" + mName + " = "
							+ ms[i].invoke(this, (Object[]) null));
				} catch (Exception e) {
				}
			}

		}

		return buffer.toString();
	}

}

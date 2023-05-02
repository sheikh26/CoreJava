package com.exception;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws LoginException {
		
		String user = null; // "Dheeraj";
		
		if(user == null){
			LoginException e = new LoginException("My Exc");
			throw e;
		}
		else{
			System.out.println("User is "+ user);
		}
		
		


	}

	public static void testException(int i) {
		// TODO Auto-generated method stub

		switch (i) {
		case 0:
			int k = 0;
			try {
				int j = 123 / k;
			} catch (ArithmeticException e) {
				System.out.println("Got ArithmeticException exception");
				//e.printStackTrace();
			}finally {
				System.out.println("I will be executed in both cases");
			}
			
			break;
		case 1:
			String name = "Vijay";
			try {
				System.out.println(name.length() + name.charAt(9));
			} catch (NullPointerException e) {
				System.out.println("Got NullPointerException exception");

			}
			break;
		case 2:
			String[] names = new String[2];
			System.out.println(names[3]);
			break;
		case 3:
			Object o = "This is a String";

			Integer in = (Integer) o;

			break;
		default:
			System.out.println("This is Default");

		}

	}
}

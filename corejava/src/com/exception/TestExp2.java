package com.exception;

public class TestExp2 {

	public static void main(String[] args) {
		System.out.println("Main is callin a");
		a();
	}

	public static void a() {
		System.out.println("a is callin b");
		b();

	}

	public static void b() {
		System.out.println("b is callin c");
		c();
	}

	public static void c() {

		System.out.println("c is callin d");
		// d();

		AccountException e = new AccountException();
		try {
			boolean flag = true;
			if (flag) {
				throw e;
			}
		} catch (AccountException e1) {
			System.out.println(" Account Exception Occured");
		}

	}

	public static void d() {
		System.out.println("Congratulations!! finally you have reached to D");
		// ArithmeticException e = new ArithmeticException();
		UserNotFoundException e = new UserNotFoundException();
		throw e;
	}

}

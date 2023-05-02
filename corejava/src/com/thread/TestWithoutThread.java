package com.thread;

public class TestWithoutThread {

	public static void main(String[] args) {

		HelloWithoutThread t1 = new HelloWithoutThread("1");

		t1.run();

		HelloWithoutThread t2 = new HelloWithoutThread("2");

		t2.run();

	}

}

package com.thread;

public class TestWithoutThread {

	public static void main(String[] args) {

		HelloWithoutThread t1 = new HelloWithoutThread("Arif");

		t1.run();

		HelloWithoutThread t2 = new HelloWithoutThread("Michel");

		t2.run();

	}

}

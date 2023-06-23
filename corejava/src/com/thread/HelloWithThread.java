package com.thread;

public class HelloWithThread extends Thread {

	String name = null;

	public HelloWithThread(String threadName) {
		//super(threadName);
		name = threadName;
	}

	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello Thread " + name);
		}

	}

}

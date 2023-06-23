package com.thread;

public class TestThreadPriority {

	public static void main(String[] args) {

		HelloWithThread t1 = new HelloWithThread("Arif");
		
		//Thread t1 = new Thread(new HelloWithRunnableThread("One"));
		t1.setPriority(1);

		HelloWithThread t2 = new HelloWithThread("Michel");

		//Thread t2 = new Thread(new HelloWithRunnableThread("Two"));
		t2.setPriority(10);

		t1.start();
		t2.start();
		
		/*
		 * for (int i = 0; i < 500; i++) { System.out.println(i + " This is Main"); }
		 */

	}

}


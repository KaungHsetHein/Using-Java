package com.jdc.excep;

public class ExceptionApp {

	public static void main(String[] args) {
		
		System.out.println("Started");
		methodOne();//clll task
		System.out.println("Terminated");
		
		
	}
	
	static void methodOne() {
	
		System.out.println("Method one");
		methodTwo();
	}
	
	static void methodTwo() {
		try {
			methodThree();
		} catch (InterruptedException e) {
			// Exception&& throwable don't save
			System.err.println("Hello thread");
		}
		
		System.out.println("Method two");
		
	}
	static void methodThree() throws InterruptedException{
		
		System.out.println("Before thread");
	    Thread.sleep(1000);
       // System.out.println(3/0);
		System.out.println("After thread");
	}

}

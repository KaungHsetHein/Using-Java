package com.jdc.lam;

public class Runner extends SuperRunner{
	//constructor method reference
	public Runner(int number) {
		System.out.println("Number is "+number);
	}
	
	public static void main(String[] args) {
		//instance method referecnce
		Runner runner = new Runner(0);
		Printable p = runner::display;
		p.print("This is data");
		//static method reference
		Calculable c = AppUtil::operate;
		int result = c.claculate(30, 50);
		
		System.out.println(result);
		
		Scalable s = Runner::new;
		s.scale(30);
		
	}

	public void run() {
		//instance method references
		Printable p = super::display;
		p.print("This is data.");
		
	}
	
	public void display(String data) {
		
		System.out.println(" Runner Start display()");
		System.out.println(data);
		System.out.println("Runner End display()");
	}
}

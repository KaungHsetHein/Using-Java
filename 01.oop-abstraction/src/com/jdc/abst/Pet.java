package com.jdc.abst;

public interface Pet {

	public abstract void askForFood();
	
	public static void main(String[] args) {
		
		
		Interfacetwo two = new Interfacetwo() {
			
			
			
			@Override
			public void dotwo() {
				// TODO Auto-generated method stub
				System.out.println("doTwo()");
				
			}

			@Override
			public void doOne() {
				// TODO Auto-generated method stub
				System.out.println("doOne()");
				
			}
		
		};
		two.doOne();
		two.dotwo();
		two.printDay("No women no cry");
		System.out.println();
	}	
}

interface InterfaceOne{
	int VALUE = 100;

	void doOne();
	static void something() {
		
	}
	

 default  void printDay (String s) {

 }
}
interface Interfacetwo extends InterfaceOne{
	String data = "";
	void dotwo();
}

interface Interfacethree{
	void doThree();
}

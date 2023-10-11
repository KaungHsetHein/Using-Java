package com.jdc.abst;

//all the things the classes can do 

public abstract class Animal {
	
	private String color;
	
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static Block");
	}

	public Animal(String color) {
		super();
		this.color = color;
	}

	

	public String getColor() {
		return color;
	}
	
	public abstract void eat(String food);

	
}

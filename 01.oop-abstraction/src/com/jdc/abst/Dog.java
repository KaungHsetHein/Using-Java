package com.jdc.abst;

public class Dog extends Animal implements Pet{
	
	public Dog(String color) {
		super(color);
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("Dog eat %s".formatted(food));
		
	}

	@Override
	public void askForFood() {
		// TODO Auto-generated method stub
		
	}

}

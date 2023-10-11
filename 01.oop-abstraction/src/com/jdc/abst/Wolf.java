package com.jdc.abst;

public class Wolf extends Canine {

	public Wolf(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("Wolf eats"+ food);
	}

}

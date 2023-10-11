package com.jdc.abst;

public class HumanBeings {
	
	private Pet pet;
	
	public HumanBeings() {
		// TODO Auto-generated constructor stub
		pet = new Dog("Black");
	}
	public void feedingFood() {
		pet.askForFood();
	}

}

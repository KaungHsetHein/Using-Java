package com.jdc.abst;

public class AbstractionApp {

	public static void main(String[] args) {
		Animal goatKyar = new Dog("Yellow");
		System.out.println(goatKyar);
		goatKyar.eat("Steak");
		
		Animal alpha = new Wolf("Grey");
		alpha.eat("deer");
		//Anonymous inner class
		Animal shwe = new Animal("Gold") {

			@Override
			public void eat(String food) {
				// TODO Auto-generated method stub
				System.out.println("Fish eats"+ food);
				
			}
			
		};
		shwe.eat("Seaweeds");
		Animal shwee = new Animal("Gold") {

			@Override
			public void eat(String food) {
				// TODO Auto-generated method stub
				System.out.println("Bird eats"+ food);
				
			}
			
		};
		shwee.eat("sunflower seeds");

	}

}

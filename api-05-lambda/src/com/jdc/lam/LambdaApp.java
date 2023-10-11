package com.jdc.lam;

public class LambdaApp {

	public static void main(String[] args) {
		// ()sum args ->lambda sign {} implements
		Flyable objFly = () ->
				System.out.println("Flying....");
				
			
			
		
		System.out.println(objFly.getClass().getName());
		objFly.fly();
		
		Printable objPrint = data ->{
				System.out.println(data);
				
			
			
		};
		objPrint.print("This is data you want.");
		
		Calculable objCal = ( a,  b)-> a+b;
		System.out.println(objCal.claculate(21, 9));
		
		int point = 10;
		
		Scalable objScale = (int num) -> System.out.println("Object is scaling at this point %d.".formatted(num+point));
		
		objScale.scale(120);

	}

}

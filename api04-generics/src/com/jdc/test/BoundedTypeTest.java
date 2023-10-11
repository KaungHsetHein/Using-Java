package com.jdc.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.jdc.generic.Box;

public class BoundedTypeTest {
	
	class A {
		
	}
	class SubA extends A implements C ,D{
		
	}
	class B{
		
	}
	class SubB extends B{
		
	}
	interface C extends D{
		
	}
	class SubC implements C{
		
	}
	
	interface D{
		
	}
	class SubD implements D{
		
	}
	abstract class E {
		
	}
	class SubE extends E{
		
	}
	 enum Day {
		
	}
	
	class MultiBound<T extends  C & D>{
		
	}
	@Test
	void test() {
		
		MultiBound<SubA> multi = new MultiBound<>();
		
		var box = new Box<Integer>();
		
		box.setData(20);
		box.inspect(100L);
		
		process(List.of(1,2,3,4,5,6,7,8,9,10));
	}
	
	void process(List<? extends Number> list) {
		double result = 0.0;
		
		for(Number n: list) {
			result += n.doubleValue();
		}
		System.out.println("Sum of digit:"+result);
		
		
		
	}

}

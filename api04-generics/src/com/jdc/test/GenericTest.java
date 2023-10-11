package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.jdc.generic.BeforeGenericBox;
import com.jdc.generic.GenericBox;
import com.jdc.generic.OrderPair;
import com.jdc.generic.Pair;
import com.jdc.generic.SubPair;

public class GenericTest {
	public GenericTest() {
		System.out.println("Test COnstructor");
	}
	
//	public <K,V> GenericTest(Pair<K,V>p1,Pair<K,V>p2) {
//		// TODO Auto-generated constructor stub
//	}
	
	<K,V> boolean compair(Pair<K,V>p1,Pair<K,V>p5) {
		return p1.getKey().equals(p5.getKey())&& p1.getValue().equals(p5.getValue());
		
	}
	
	@Test
	void test_for_multiple_type() {
		Pair<String,Integer> p1 = new OrderPair<>("Apple",2000);
		
		Pair<Integer, Integer> p2 = new OrderPair<>(100,100);
		
		Pair<String,Integer> p5 = new OrderPair<>("Orange",2000);
		
		assertFalse(compair(p1,p5));
		
		Pair<Double, Double> p3 = new Pair<Double,Double>(){

			@Override
			public Double getKey() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double getValue() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		Pair<Character, Boolean> p4 = new SubPair<>('က',true);
		
		assertAll(
				  () ->assertEquals("Apple",p1.getKey()),
				  () -> assertEquals(2000,p1.getValue()),
				  () -> assertEquals(100,p2.getKey()),
				  () -> assertEquals(100,p2.getValue()),
				  () -> assertEquals(100D,p3.getKey()),
				  () -> assertEquals(200D,p3.getValue()),
				  () -> assertEquals('က',p4.getKey()),
				  () -> assertEquals(true,p4.getValue())
				  );
		
	}
	
	@Test
	void test_for_non_generic() {
		//raw type=> Object type
		BeforeGenericBox boxOne = new BeforeGenericBox("Box One");
		boxOne.setData(100);
		boxOne.setData(2000.000);
		
		assertEquals(2000d,boxOne.getData());
	}
	
	@Test
	void test_for_generic() {
		
		GenericBox<String> gBox = new GenericBox<String>("A");
		gBox.setData("String Box");
		assertEquals("String Box",gBox.getData());
		
		GenericBox<Double> douBox = new GenericBox<>(200d);
		douBox.setData(49D);
		
		
		
		
	}

}

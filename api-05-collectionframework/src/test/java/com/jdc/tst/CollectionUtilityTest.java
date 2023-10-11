package com.jdc.tst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.jdc.col.Student;
import com.jdc.col.StudentByGrade;

public class CollectionUtilityTest {
	
	@ParameterizedTest
	@MethodSource("getStudentList")
	void test_for_custom_sort(List<Student> stulist) {
		
		
		//System.out.println(stulist);
		stulist.forEach(System.out::print);
		Collections.sort(stulist);
		stulist.forEach(System.out::print);
		
		Collections.sort(stulist, new StudentByGrade());
		System.out.println();
		stulist.forEach(System.out::print);
		
		var byAge = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getAge() - o1.getAge();
			}
			
		};
		Collections.sort(stulist, byAge);
		System.out.println();
		stulist.forEach(System.out::print);
		
	}
	
	static Stream<Arguments> getStudentList(){
		return Stream.of(
				Arguments.of(
						Arrays.asList(
								new Student("Zyan",24,'C'),
								new Student("Bumble",18,'D'),
								new Student("William",15,'A'),
								new Student("Scott",20,'B'),
								new Student("David",17,'D')
								)));
	}
	
	//@Test
	void test_for_sort() {
		var intlist = new ArrayList<Integer>();
		Collections.addAll(intlist,2,4,6,8,10,9,7,5,3,1);
		System.out.println(intlist);
		
		var strlist = Arrays.asList("Kabom","dubi","ester","haper","cay");
		System.out.println(strlist);
		Collections.sort(strlist);
		System.out.println(strlist);
		
		var charlist = Arrays.asList('\u1011','\u1000','\u1012','\u1001');
		System.out.println(charlist);
		Collections.sort(charlist);
		System.out.println(charlist);
		
		var boolist = Arrays.asList(true,true,false,false,true,false);
		System.out.println(boolist);
		Collections.sort(boolist);
		System.out.println(boolist);
	}
	
	@Test
	@Disabled
	void test() {
		
		var list = new ArrayList<Integer>();
		Collections.addAll(list,2,4,6,8,10,9,7,5,3,1);
		
		System.out.println("Original"+list);
		
		Collections.reverse(list);
		System.out.println("Reverse"+list);
		
		var des = new ArrayList<Integer>();
		Collections.addAll(des, null,null, null,null, null,null, null,null,null,null);
		Collections.copy(des, list);
		System.out.println("Copy"+ des);
		
		System.out.println(Collections.disjoint(Arrays.asList(100,200,20), list));
		
		
		
	}

}

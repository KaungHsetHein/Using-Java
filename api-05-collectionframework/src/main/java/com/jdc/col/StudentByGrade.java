package com.jdc.col;

import java.util.Comparator;

public class StudentByGrade implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getGrade() - s2.getGrade();
	}

}

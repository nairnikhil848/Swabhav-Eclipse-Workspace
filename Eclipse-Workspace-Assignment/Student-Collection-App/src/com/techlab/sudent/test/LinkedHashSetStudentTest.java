package com.techlab.sudent.test;

import java.util.LinkedHashSet;
import java.util.Set;

import com.techlab.model.Student;

public class LinkedHashSetStudentTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> studs = new LinkedHashSet<Student>();
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(3,"Parth",7.7,23,"a"));
		studs.add(new Student(4,"Harish",7.8,24,"a"));
	
		for(Student str : studs) {
			System.out.println(str);
		}
	}
}

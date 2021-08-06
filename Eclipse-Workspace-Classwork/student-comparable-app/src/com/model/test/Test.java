package com.model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlab.model.Student;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student(1,"Nikhil",8.9,21,"a"));
		studs.add(new Student(2,"Rahul",7.6,22,"a"));
		studs.add(new Student(3,"Parth",9.7,23,"a"));
		studs.add(new Student(4,"Harish",8.0,24,"a"));
		
		Collections.sort(studs);
		
		for(Student str : studs) {
			System.out.println(str);
		}
	}
}

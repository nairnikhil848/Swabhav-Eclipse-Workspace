package com.techlab.sudent.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class ListStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(2,"Rahul",7.6,22,"a"));
		studs.add(new Student(3,"Parth",7.7,23,"a"));
		studs.add(new Student(4,"Harish",7.8,24,"a"));
		
		studs.set(0,new Student(1,"Nair",7.5,21,"a"));
		for(Student str : studs) {
			System.out.println(str);
		}
		System.out.println("Specific Student in index 0: "+studs.get(0));
		studs.remove(0);
		for(Student str : studs) {
			System.out.println(str);
		}
		
	}
	}



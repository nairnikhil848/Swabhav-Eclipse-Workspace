package com.techlab.sudent.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.model.Student;

public class HashSetStudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> studs = new HashSet<Student>();
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(1,"Nikhil",7.5,21,"b"));
		studs.add(new Student(3,"Parth",7.7,23,"b"));
		studs.add(new Student(4,"Harish",7.8,24,"a"));
		
		for(Student str : studs) {
			System.out.println(str);
		}
		
		
	}
	}
	

package com.techlab.sudent.test;

import java.util.Set;
import java.util.TreeSet;

import com.techlab.model.Student;

public class TreeSetStudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> studs = new TreeSet<Student>();
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(1,"Nikhil",7.5,21,"a"));
		studs.add(new Student(3,"Parth",7.7,23,"a"));
		studs.add(new Student(3,"Harish",7.8,24,"b"));

		for(Student str : studs) {
			System.out.println(str);
		}
	}


}

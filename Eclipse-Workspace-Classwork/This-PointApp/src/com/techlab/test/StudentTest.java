package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10, "Nikhil");
		Student s2 = new Student(20, "Notme", 50);
//		Student elder = s1.whoIsElder(s2);
		printInfo(s1);
		printInfo(s2);
//		printInfo(elder);

	}

	private static void printInfo(Student stud) {
		// TODO Auto-generated method stub
		System.out.println("Id of the Student is " + stud.getId());
		System.out.println("Name of the Student is " + stud.getName());
		System.out.println("Age of the Student is " + stud.getAge());
//		System.out.println("Hash code of the Student is " + stud.hashCode());

	}

}

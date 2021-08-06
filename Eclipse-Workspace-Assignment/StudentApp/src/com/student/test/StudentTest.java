package com.student.test;

import com.student.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud = new Student();
		stud.setName("nikhil");
		stud.setAge(22);
		stud.setId(30);
		printInf(stud);
	}

	private static void printInf(Student stud) {
		System.out.println("Name of the Student is " +stud.getName());
		System.out.println("Age of the Student is " +stud.getAge());
		System.out.println("Id of the student is " +stud.getId());
		
	}

}

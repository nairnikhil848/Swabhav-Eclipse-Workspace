package com.techlab.repositories;



import org.junit.jupiter.api.Test;

import com.techlab.models.Student;

class StudentRepositoryTest {

	@Test
	void test() {
		Student stud = new Student("Student3", 11, 2.2, "Address 3");
		stud.setId("4be44d30-9f69-4782-aaa5-f109c6ec03b6");
		StudentRepository studentRepository = new StudentRepository();
		studentRepository.editStudent(stud);

//		Student stud = StudentRepository.getStudent("7549f66a-fe42-474f-b915-4e0e56604dd1");
//		System.out.println(stud.getId());
//		System.out.println(stud.getName());
//		System.out.println(stud.getRollno());

//		StudentRepository.addStudent(new Student("Student1", 1, 7.2, "Address 1"));
//		StudentRepository.addStudent(new Student("Student2", 2, 8.2, "Address 2"));
//		StudentRepository.addStudent(new Student("Student3", 3, 9.2, "Address 3"));
//		StudentRepository.addStudent(new Student("Student4", 4, 5.2, "Address 4"));
//		
//		
//		List<Student> l = StudentRepository.getStudentList();
//		
//		for(Student student: l) {
//			
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getRollno());
//		}

	}

}

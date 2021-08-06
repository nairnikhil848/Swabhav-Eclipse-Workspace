package com.techlab.services;

import java.util.ArrayList;
import java.util.List;

import com.techlab.models.Student;

public class StudentService implements IService {
	private static IService serviceInstance = null;
	private List<Student> StudentList;

	public static IService getInstance() {
		if (serviceInstance == null) {
			System.out.print("inside new Service");
			serviceInstance = new StudentService();
		}

		return serviceInstance;
	}

	public StudentService() {

		System.out.println("New Service Created");
		StudentList = new ArrayList<Student>();
		StudentList.add(new Student("Student1", 1, 7.2, "Address 1"));
		StudentList.add(new Student("Student2", 2, 8.2, "Address 2"));
		StudentList.add(new Student("Student3", 3, 9.2, "Address 3"));
		StudentList.add(new Student("Student4", 4, 5.2, "Address 4"));

	}

	@Override
	public List<Student> getStudentList() {
		return StudentList;
	}

	@Override
	public void addStudent(Student student) {
		StudentList.add(student);
	}

	@Override
	public Student getStudent(String id) {
		for (Student student : StudentList) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public void editStudent(Student student) {
		for (Student stud : StudentList) {
			if (stud.getId() == student.getId()) {
				stud = student;
				return;
			}
		}
	}

	@Override
	public void deleteStudent(Student student) {
		for (Student stud : StudentList) {
			if (stud.getId() == student.getId()) {
				StudentList.remove(stud);
				stud = null;
				return;
			}
		}
	}

}

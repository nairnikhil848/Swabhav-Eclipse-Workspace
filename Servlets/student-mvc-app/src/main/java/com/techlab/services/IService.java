package com.techlab.services;

import java.util.List;

import com.techlab.models.Student;

public interface IService {

	List<Student> getStudentList();

	void addStudent(Student student);
	
	Student getStudent(String id);
	
	void editStudent(Student student);
	
	void deleteStudent(Student student);

}
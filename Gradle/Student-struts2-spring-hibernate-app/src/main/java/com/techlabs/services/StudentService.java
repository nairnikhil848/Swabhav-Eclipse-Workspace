package com.techlabs.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Student;
import com.techlabs.repositories.StudentHRepository;

@Service("studentSvc")
public class StudentService {

	@Autowired
	private StudentHRepository repo;

	public StudentService() {
		System.out.println("Service Created");
	}

	public List<Student> getStudentsList() {
		return repo.getStudentsList();
	}

	public boolean addStudent(Student student) {
		return repo.AddStudent(student);
	}

	public boolean updateStudent(Student student) {
		return repo.updateStudent(student);
	}

	public Student getStudent(int id) {
		return repo.getStudent(id);
	}

	public boolean deleteStudent(int id) {
		return this.repo.deleteStudent(id);
	}
}

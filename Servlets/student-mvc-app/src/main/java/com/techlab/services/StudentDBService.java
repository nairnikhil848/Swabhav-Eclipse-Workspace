package com.techlab.services;

import java.util.List;

import com.techlab.models.Student;
import com.techlab.repositories.StudentRepository;

public class StudentDBService implements IService {
	private static IService serviceInstance = null;
	private StudentRepository studentrepository;
	
	public static IService getInstance() {
		if (serviceInstance == null) {
			System.out.print("inside new Service");
			serviceInstance = new StudentDBService();
		}
		return serviceInstance;
	}
	
	public StudentDBService() {
		
		studentrepository = new StudentRepository();
		
	}
	
	@Override
	public List<Student> getStudentList() {
		return studentrepository.getStudentList();
	}

	@Override
	public void addStudent(Student student) {
		studentrepository.addStudent(student);
	}

	@Override
	public Student getStudent(String id) {
		return studentrepository.getStudent(id);
	}

	@Override
	public void editStudent(Student student) {
		studentrepository.editStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentrepository.deleteStudent(student);
	}

}

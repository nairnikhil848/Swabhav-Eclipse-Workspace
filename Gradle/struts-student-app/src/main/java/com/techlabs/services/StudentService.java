package com.techlabs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.models.Student;
import com.techlabs.models.StudentView;
import com.techlabs.repositories.StudentRepository;

@Service("studentSvc")
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentService() {
		System.out.println("Service Created");
	}

	public List<Student> getStudentsList() {
		return studentRepository.getStudentsList();
	}

	public boolean addStudent(StudentView student) {
		Student stud = new Student(student.getName(), student.getRollno(), student.getCgpa(), student.getLocation());
		return studentRepository.addStudent(stud);
	}

	public boolean updateStudent(StudentView student) {
		Student stud = new Student(student.getName(), student.getRollno(), student.getCgpa(), student.getLocation());
		stud.setId(student.getId());

		return studentRepository.editStudent(stud);
	}

	public StudentView getStudent(String id) {
		StudentView student = new StudentView();
		Student stud = studentRepository.getStudent(id);
		student.setId(stud.getId());
		student.setName(stud.getName());
		student.setCgpa(stud.getCgpa());
		student.setRollno(stud.getRollno());
		student.setLocation(stud.getLocation());

		return student;
	}

	public boolean deleteStudent(String id) {
		return this.studentRepository.deleteStudent(id);
	}
}

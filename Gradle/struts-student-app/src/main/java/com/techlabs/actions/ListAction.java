package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

public class ListAction extends ActionSupport {

	@Autowired
	private StudentService service = null;
	private List<Student> studentList;

	@Override
	public String execute() throws Exception {
		setStudentList(service.getStudentsList());
		
		for(Student stud:studentList) {
			System.out.println(stud.getCgpa());
			System.out.println(stud.getRollno());
		}
		System.out.println(service.getStudentsList().size());
		return this.SUCCESS;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}

package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.StudentView;
import com.techlabs.services.StudentService;

public class AddAction extends ActionSupport {

	@Autowired
	private StudentService service = null;
	private StudentView student;

	@Override
	public String execute() throws Exception {
//		service.addStudent(student);
		return this.SUCCESS;
	}

	public String addStudent() {
		System.out.println(student.getId());
		if (validateStudent()) {
			if (service.addStudent(student)) {
				return this.SUCCESS;
			}
		}
		return this.ERROR;
	}

	public boolean validateStudent() {
		if (student.getName().length() == 0) {
			return false;
		}

		if (student.getRollno() == 0) {
			return false;
		}

		if (student.getCgpa() == 0) {
			return false;
		}
		return true;
	}

	public StudentView getStudent() {
		return student;
	}

	public void setStudent(StudentView student) {
		this.student = student;
	}

}

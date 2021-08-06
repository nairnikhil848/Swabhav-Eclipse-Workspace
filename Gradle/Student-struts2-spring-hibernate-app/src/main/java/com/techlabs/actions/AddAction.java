package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.services.StudentService;

public class AddAction extends ActionSupport implements ModelDriven<Student> {

	@Autowired
	private StudentService service = null;

	private Student student = new Student();

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String addStudent() {
		if (validateStudent()) {
			if (service.addStudent(getStudent())) {
				return this.SUCCESS;
			}
		}
		return this.ERROR;
	}

	public boolean validateStudent() {
		if (getStudent().getName().length() == 0) {
			return false;
		}

		if (getStudent().getRollno() == 0) {
			return false;
		}

		if (getStudent().getCgpa() == 0) {
			return false;
		}
		return true;
	}

	@Override
	public Student getModel() {
		return getStudent();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}

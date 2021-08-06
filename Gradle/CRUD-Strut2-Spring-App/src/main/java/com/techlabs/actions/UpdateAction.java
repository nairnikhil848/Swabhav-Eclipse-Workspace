package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Student;
import com.techlabs.models.StudentView;
import com.techlabs.services.StudentService;

public class UpdateAction extends ActionSupport {

	@Autowired
	private StudentService service = null;
	private StudentView student;
	private String id;

	@Override
	public String execute() throws Exception {

		return this.SUCCESS;
	}

	public String UpdateStudent() {
		this.setStudent(service.getStudent(id));
		System.out.println(this.getStudent().getName());
		System.out.println(this.getStudent().getId());
		
		return this.SUCCESS;
	}

	public String doUpdateStudent() {
		System.out.println("ID: is " + this.getStudent().getId());
		System.out.println("here");
		System.out.println(student.getName());
		if (service.updateStudent(this.getStudent())) {
			return this.SUCCESS;
		}
		return this.ERROR;
	}

	public StudentView getStudent() {
		return student;
	}

	public void setStudent(StudentView student) {
		this.student = student;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

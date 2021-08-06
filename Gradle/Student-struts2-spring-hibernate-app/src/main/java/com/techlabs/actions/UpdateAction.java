package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.services.StudentService;

public class UpdateAction extends ActionSupport implements ModelDriven<Student> {

	@Autowired
	private StudentService service = null;

	private Student student = new Student();

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String UpdateStudent() {
		System.out.println(student.getId());
		this.setStudent(service.getStudent(student.getId()));
		System.out.println(this.getStudent().getName());
		System.out.println(this.getStudent().getId());
		System.out.println(this.getStudent().getLocation());
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

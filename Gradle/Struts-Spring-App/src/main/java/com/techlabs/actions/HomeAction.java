package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

public class HomeAction implements Action {

	@Autowired
	private StudentService service = null;
	private int count;
	private List<Student> studentList;

	@Override
	public String execute() throws Exception {
		System.out.println(service.get().size());
		setCount(service.get().size());
		setStudentList(service.get());

		return this.SUCCESS;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}

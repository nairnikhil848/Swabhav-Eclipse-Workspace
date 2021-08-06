package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

public class DeleteAction extends ActionSupport {
	@Autowired
	private StudentService service = null;

	private String id;

	@Override
	public String execute() throws Exception {

		if (getService().deleteStudent(getId())) {
			return this.SUCCESS;
		}
		return this.ERROR;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

}

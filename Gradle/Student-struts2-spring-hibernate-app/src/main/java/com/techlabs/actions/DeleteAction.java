package com.techlabs.actions;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.services.StudentService;

public class DeleteAction extends ActionSupport {
	@Autowired
	private StudentService service = null;

	private String id;

	@Override
	public String execute() throws Exception {
		System.out.println("here delete");
		System.out.println(getId());

		if (getService().deleteStudent(Integer.parseInt(id))) {
			return this.SUCCESS;
		}
		return this.ERROR;
	}

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.services.StudentService;

public class HomeAction implements Action {

	@Autowired
	private StudentService service = null;
	private int count;

	@Override
	public String execute() throws Exception {
		System.out.println(service.get().size());
		setCount(service.get().size());
	
		return this.SUCCESS;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

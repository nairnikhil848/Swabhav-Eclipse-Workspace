package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements Action {

	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("Inside execute");
		System.out.println(name);
		return this.SUCCESS;
	}

}

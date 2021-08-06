package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.services.StudentService;

public class HomeAction implements Action {
	

	
	@Override
	public String execute() throws Exception {
//		System.out.println(service.get().size());
		System.out.println("here");
		return this.SUCCESS;
	}

}

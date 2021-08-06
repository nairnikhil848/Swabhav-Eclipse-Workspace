package com.techlabs.actions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {
	
	private String dateAndTime;
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("inside Browse");
		this.setDateAndTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")).toString());
//		System.out.println(this.getDateAndTime());
		return this.SUCCESS;
	}


	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}

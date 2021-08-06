package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	@Override
	public String execute() {
		return this.SUCCESS;
	}

	public String doCaptcha() {
		return this.SUCCESS;
	}
}

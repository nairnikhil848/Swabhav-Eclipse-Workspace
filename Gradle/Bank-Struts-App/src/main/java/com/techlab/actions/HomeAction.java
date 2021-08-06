package com.techlab.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> session;
//	private String name;

	@Override
	public String execute() throws Exception {
		System.out.println("Welcome to home");

//		String name = (String) this.getSession().get("name");
//		System.out.println("Name " + name);
		return this.SUCCESS;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;

	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}

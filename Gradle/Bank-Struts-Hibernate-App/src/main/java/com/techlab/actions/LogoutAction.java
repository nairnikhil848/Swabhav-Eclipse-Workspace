package com.techlab.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		session.invalidate();
		return this.SUCCESS;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}
}

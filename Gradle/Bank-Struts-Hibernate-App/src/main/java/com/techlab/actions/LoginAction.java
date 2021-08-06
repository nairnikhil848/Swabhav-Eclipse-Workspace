package com.techlab.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.models.Account;
import com.techlab.services.AuthenticationService;

public class LoginAction extends ActionSupport implements SessionAware {

	@Autowired
	AuthenticationService service;

	private SessionMap<String, Object> session;
	private String name;
	private String password;

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String dologin() {

		System.out.println("Here Inside doLogin");
		System.out.println(name);
		System.out.println(password);
		Account acc = service.authenticateUser(name, password);
		if (acc != null) {
			this.getSession().put("id", acc.getId());
			this.getSession().put("name", acc.getName());
			this.getSession().put("balance", acc.getBalance());

			String id = (String) this.getSession().get("lastAction");
			System.out.println("Last Action: " + id);

			return this.SUCCESS;
		}
		System.out.println("Also here");
		return this.ERROR;
	}

	@Override
	public void validate() {
		if (this.name == "") {
			addFieldError("name", "name is required.");
		}
		if (this.password == "") {
			addFieldError("password", "password is required.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;

	}

}

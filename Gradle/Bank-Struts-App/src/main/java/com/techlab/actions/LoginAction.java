package com.techlab.actions;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.models.AccountHolder;
import com.techlab.services.AuthenticationService;

public class LoginAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> session;
	private String name;
	private String password;

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String dologin() {

		AuthenticationService service = AuthenticationService.getInstance();

		AccountHolder acc = service.authenticateUser(name, password);
		if (acc != null) {
			this.getSession().put("id", acc.getId());
			this.getSession().put("name", acc.getName());
			this.getSession().put("balance", acc.getBalance());

			String id = (String) this.getSession().get("lastAction");
			System.out.println("Last Action: " + id);

			return this.SUCCESS;
		}
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
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;

	}

}

package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.Action;

public class SessionAction implements Action, SessionAware {

	private Map<String, Object> session;
	private int oldCount;
	private int newCount;

	@Override
	public String execute() throws Exception {
		System.out.println("here");
		Integer count = (Integer) this.getSession().get("counter");

		if (count == null) {
			count = 0;
			this.oldCount = count;
			this.newCount = count;
		} else {
			this.oldCount = count;
			count = count + 1;
			this.newCount = count;
		}

		this.getSession().put("counter", count);

		System.out.println("Inside Session");
		return this.SUCCESS;
	}

	public int getOldCount() {
		return oldCount;
	}

	public void setOldCount(int oldCount) {
		this.oldCount = oldCount;
	}

	public int getNewCount() {
		return newCount;
	}

	public void setNewCount(int newCount) {
		this.newCount = newCount;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap) session;
	}
//	public void setSession(Map<String, Object> session) {
//		this.session = session;
//	}

}

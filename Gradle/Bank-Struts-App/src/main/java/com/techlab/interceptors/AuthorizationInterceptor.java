package com.techlab.interceptors;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthorizationInterceptor implements Interceptor {

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("inside auth interceptor");
		ActionContext context = invocation.getInvocationContext();
		SessionMap<String, Object> map = (SessionMap<String, Object>) invocation.getInvocationContext().getSession();

		System.out.println(context.getName().equalsIgnoreCase("login"));
		if (!context.getName().equalsIgnoreCase("login") && !context.getName().equalsIgnoreCase("dologin")) {
			map.put("lastAction", context.getName());
			System.out.println("LastAction PUT" + context.getName());
		}

		if (context.getName().equalsIgnoreCase("login") || context.getName().equalsIgnoreCase("register")
				|| context.getName().equalsIgnoreCase("home") || context.getName().equalsIgnoreCase("dologin")
				|| context.getName().equalsIgnoreCase("doregister") || context.getName().equalsIgnoreCase("")) {
			System.out.println("here");
			return invocation.invoke();
		}

		if (map == null) {
			return "login";
		}
		Object id = map.get("id");
		if (id == null || id.equals("") || map.isEmpty() || map == null) {
			return "login";
		}

		return invocation.invoke();
	}

}

package com.techlab.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/home")
public class LogFilter implements Filter {

	public LogFilter() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String ipAddress = request.getRemoteAddr();

		System.out.println(" FILTER ---IP " + ipAddress + ", Time " + new Date().toString());

		chain.doFilter(request, response);

	}



	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}

package com.techlab.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/home")
public class CapitalizeFilter implements Filter {

	public CapitalizeFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.write("<html><body><div id='servletResponse1' style='text-align: center;'>");

		String password = request.getParameter("password");

		if (password != null ) {
			out.print("<p id='errMsg' style='color: blue; font-size: larger;'>Your Password is :"+password.toUpperCase()+".</p>");

			chain.doFilter(request, response);
		} 
		out.write("</div></body></html>");
		out.close();
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}

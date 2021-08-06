package com.techlab.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/home")
public class loginFilter implements Filter {

	public loginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.write("<html><body><div id='servletResponse' style='text-align: center;'>");

		String password = request.getParameter("password");
		System.out.println("Password Is?= " + password);

		if (password != null && password.equals("admin")) {
			out.print(
					"<p id='errMsg' style='color: green; font-size: larger;'>Password Is Correct.</p>");
			
			chain.doFilter(request, response);
		} else {
			
			out.print(
					"<p id='errMsg' style='color: red; font-size: larger;'>Password Is Invalid. Please Try Again ....!</p>");
			chain.doFilter(request, response);
			
		}

		out.write("</div></body></html>");
		out.close();
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}

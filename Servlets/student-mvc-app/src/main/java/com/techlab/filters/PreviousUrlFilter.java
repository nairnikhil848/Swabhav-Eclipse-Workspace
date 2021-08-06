package com.techlab.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/add", "/edit" })
public class PreviousUrlFilter implements Filter {

	public PreviousUrlFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession(false);
		if (session.getAttribute("uname") == null) {
			String prevUrl = req.getRequestURI();
			if (((HttpServletRequest) request).getQueryString() != null) {
				prevUrl = prevUrl + "?" + ((HttpServletRequest) request).getQueryString();
			}
			session.setAttribute("prevUrl", prevUrl);
			res.sendRedirect(req.getContextPath() + "/login");
			return;
		}
		chain.doFilter(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}

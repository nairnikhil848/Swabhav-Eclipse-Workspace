package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.services.AuthenticationService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/login.jsp");
		HttpSession session = request.getSession();
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		AuthenticationService service = new AuthenticationService();
		if (service.isAuthenticated(username, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			System.out.println(session.getAttribute("prevUrl"));
			response.sendRedirect((String) session.getAttribute("prevUrl"));
			
		}
	}
}

package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.AccountHolder;
import com.techlab.services.AuthenticationService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("views/login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		AuthenticationService service = AuthenticationService.getInstance();

		AccountHolder acc = service.authenticateUser(name, password);
		if (acc != null) {
			HttpSession session = request.getSession();
			session.setAttribute("id", acc.getId());
			session.setAttribute("name", acc.getName());
			session.setAttribute("balance", acc.getBalance());
			System.out.println("Login Successfull");
			System.out.println(session.getAttribute("prevUrl"));
			if(session.getAttribute("prevUrl")!=null) {
				response.sendRedirect((String) session.getAttribute("prevUrl"));
			}
			response.sendRedirect(request.getContextPath() + "/home");
			
		}
		PrintWriter out = response.getWriter();
		out.println("<h1>Login Failed<h1>");
		out.println("<a href=\"./login \">Login Again</a>");
	}

}

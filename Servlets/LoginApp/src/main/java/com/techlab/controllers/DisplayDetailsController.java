package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayDetails")
public class DisplayDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayDetailsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (name == "") {
			name = "default name";
		}

		if (password == "") {
			password = "default password";
		}

		out.println("<p>" + "Your Name is: " + name + "</p>");
		out.println("<p>" + "Your Password is: " + password + "</p>");
	}

}

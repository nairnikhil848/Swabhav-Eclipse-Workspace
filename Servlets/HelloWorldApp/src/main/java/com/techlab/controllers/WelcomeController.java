package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		if (name == null) {
			name = "World";
		}

		for (int i = 0; i < 10; i++) {
			out.println("<p>" + "Hello " + name + " " + i + "</p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

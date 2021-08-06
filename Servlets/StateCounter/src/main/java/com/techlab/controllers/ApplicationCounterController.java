package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/application")
public class ApplicationCounterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ApplicationCounterController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext application = getServletContext();

		if (application.getAttribute("counter") == null) {
			int counter = 0;
			out.println("Old :" + counter + "<br>");
			counter = counter + 1;
			application.setAttribute("counter", counter);
			out.println(" New :" + counter + "<br>");
			out.print("<a href = 'index.html'> Back </a>");
			return;
		}

		int counter = (Integer) application.getAttribute("counter");
		out.println("Old :" + counter + "<br>");
		counter = counter + 1;
		application.setAttribute("counter", counter);
		out.println(" New :" + counter + "<br>");
		out.print("<a href = 'index.html'> Back </a>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

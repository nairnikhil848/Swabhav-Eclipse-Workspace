package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/summary")
public class SummaryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SummaryController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext application = getServletContext();
		HttpSession session = request.getSession(false);

		if (session == null) {
			out.println("No Session is Created");
			return;
		}
		if (application == null) {
			out.println("No Application is Created");
			return;
		}
		out.println("Session Counter " + session.getAttribute("counter") + "<br>");
		out.println("Application Counter " + application.getAttribute("counter"));
		out.print("<br><a href = 'index.html'> Back </a>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionCounterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionCounterController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		if (session.getAttribute("counter") == null) {
			int counter = 0;
			out.println("Old :" + counter + "<br>");
			counter = counter + 1;
			session.setAttribute("counter", counter);
			out.println(" New :" + counter + "<br>");
			out.print(" Session Id :" + session.getId());
			out.print("<br><a href = 'index.html'> Back </a>");
			return;
		}
		int counter = (Integer) session.getAttribute("counter");
		out.println("Old :" + counter + "<br>");
		counter = counter + 1;
		session.setAttribute("counter", counter);
		out.println(" New :" + counter + "<br>");
		out.print(" Session Id :" + session.getId());
		out.print("<br><a href = 'index.html'> Back </a>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

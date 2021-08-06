package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookie")
public class GetCookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetCookieController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String color = "";
		if(request.getCookies() == null ) {
			out.println("No Cookie Found");
			out.print("<br><a href = 'index.html'> Back </a>");
			return;
		}
		Cookie ck[] = request.getCookies();
		for (int i = 0; i < ck.length; i++) {
			color = ck[i].getValue();
			out.print("<br>" + ck[i].getName() + " " + ck[i].getValue() + "<br>");
		}
		
		out.println("<body style='background-color:" + color + ";'>");
		out.print("<br><a href = 'index.html'> Back </a>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

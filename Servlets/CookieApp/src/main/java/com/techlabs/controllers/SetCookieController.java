package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class SetCookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetCookieController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie ck = new Cookie("color", "red");
		ck.setMaxAge(60*60*24*7);
		response.addCookie(ck);
		out.print("<a href = 'index.html'> Back </a><br>");
		out.println("Cookie Has been Set");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.models.AccountHolder;
import com.techlab.services.AccountService;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("views/register.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AccountService accountService = AccountService.getInstance();

		String name = request.getParameter("name");
		Double balance = Double.parseDouble(request.getParameter("balance"));
		String password = request.getParameter("password");

		AccountHolder acc = new AccountHolder(name, balance, password);
		if (accountService.createAccount(acc)) {
			response.sendRedirect(request.getContextPath() + "/login");
		}
		PrintWriter out = response.getWriter();
		out.println("<h1>Account Cannot be Created<h1>");
		out.println("<a href=\"./register \">Register Again</a>");
	}
}

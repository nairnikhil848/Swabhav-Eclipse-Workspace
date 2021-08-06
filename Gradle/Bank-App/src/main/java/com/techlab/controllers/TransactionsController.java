package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.BankTransaction;
import com.techlab.services.AccountService;
import com.techlab.services.TransactionService;

@WebServlet("/transaction")
public class TransactionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TransactionsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("views/transactions.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TransactionService service = TransactionService.getInstance();
		HttpSession session = request.getSession(false);
		String id = (String) session.getAttribute("id");

		double amount = Double.parseDouble(request.getParameter("amount"));
		char type = request.getParameter("type").charAt(0);
		System.out.println(request.getParameter("type"));

		if (service.isTransactionSuccessfull(new BankTransaction(id, amount, type, LocalDateTime.now()))) {
			System.out.println("Transaction Successfull");
			AccountService accService = AccountService.getInstance();
			session.setAttribute("balance", accService.getBalance(id));
			response.sendRedirect(request.getContextPath() + "/home");
		}
		PrintWriter out = response.getWriter();
		out.println("<h1> Failed<h1>");
		out.println("<a href=\"./transaction \">Try Again</a>");

	}

}

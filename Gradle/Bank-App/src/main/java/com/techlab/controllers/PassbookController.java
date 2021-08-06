package com.techlab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.BankTransaction;
import com.techlab.services.TransactionService;

@WebServlet("/passbook")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PassbookController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TransactionService service = TransactionService.getInstance();

		HttpSession session = request.getSession(false);
		String id = (String) session.getAttribute("id");
		System.out.println("ID: " + id);

		List<BankTransaction> transactionList = service.getTransactionsList(id);
		request.setAttribute("transactionList", transactionList);
		session.setAttribute("transactionList", transactionList);
		RequestDispatcher view = request.getRequestDispatcher("views/passbook.jsp");
		view.forward(request, response);
	}

}

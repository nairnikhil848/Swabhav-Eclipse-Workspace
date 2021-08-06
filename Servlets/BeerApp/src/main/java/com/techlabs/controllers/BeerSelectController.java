package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.models.BeerExpert;

@WebServlet("/SelectBeer.do")
public class BeerSelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeerSelectController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// PrintWriter out = response.getWriter();
		String c = request.getParameter("color");

		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);

		// response.setContentType("text/html");
		// out.println("Beer Selection Advice<br>");
		//
		// Iterator<String> it = result.iterator();
		// while(it.hasNext()) {
		// out.print("<br>try: "+it.next());
		// }

		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);

	}

}

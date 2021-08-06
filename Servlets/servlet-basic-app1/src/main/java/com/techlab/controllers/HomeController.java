package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		System.out.println("Home Controller Created");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doGet");
		PrintWriter out = response.getWriter();
		java.sql.Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dept_emp_db", "root", "1234");
			out.println("<h2> Successfully Connected to " + con.getCatalog() + " Databse </h2>");

		} catch (Exception e) {

			System.out.println(e);
			out.println("<h2> Connection Failed </h2>");

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doPost");
	}

}

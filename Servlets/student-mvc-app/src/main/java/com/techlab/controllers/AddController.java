package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.Student;
import com.techlab.services.IService;
import com.techlab.services.StudentDBService;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddController() {
		System.out.println("Inside AddController");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IService service = StudentDBService.getInstance();

		String name = request.getParameter("name");
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		String location = request.getParameter("location");
		service.addStudent(new Student(name, rollno, cgpa, location));

		response.sendRedirect(request.getContextPath() + "/home");

	}

}

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

import com.techlab.models.Student;
import com.techlab.services.IService;
import com.techlab.services.StudentDBService;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		System.out.println("Home Controller Created");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IService service = StudentDBService.getInstance();

		List<Student> studentList = service.getStudentList();
		request.setAttribute("studentList", studentList);

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		view.forward(request, response);

	}

}

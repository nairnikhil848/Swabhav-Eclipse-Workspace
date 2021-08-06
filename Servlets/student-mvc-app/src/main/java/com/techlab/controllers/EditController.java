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

@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IService service = StudentDBService.getInstance();

		String id = request.getParameter("id");
		Student student = service.getStudent(id);
		request.setAttribute("student", student);

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/edit.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IService service = StudentDBService.getInstance();

		String id = (String) request.getParameter("id");
		System.out.println("ID : " + id);
		String name = request.getParameter("name");
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		String location = request.getParameter("location");

		Student student = new Student(name, rollno, cgpa, location);
		student.setId(id);
		service.editStudent(student);

		response.sendRedirect(request.getContextPath() + "/home");

	}

}

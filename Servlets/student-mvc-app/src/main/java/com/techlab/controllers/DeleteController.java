package com.techlab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.Student;
import com.techlab.services.IService;
import com.techlab.services.StudentDBService;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IService service = StudentDBService.getInstance();

		String id = request.getParameter("id");
		Student student = service.getStudent(id);
		service.deleteStudent(student);

		response.sendRedirect(request.getContextPath() + "/home");
	}

}

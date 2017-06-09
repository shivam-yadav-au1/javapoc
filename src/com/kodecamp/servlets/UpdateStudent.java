package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateStudent extends HttpServlet {

	public void UpdateStudent() {
		System.out.println("doGet() : " + this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet : " + this.getClass().getName());

		String action = request.getParameter("action");
		String rollno = request.getParameter("rollno");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String course = request.getParameter("course");
		String view = null;

		System.out.println("Value of fields are : " + action +" "+rollno +" "+ name + " " + address + " " + course);

		if ("Update".equals(action)) {
			System.out.println("Update block executed");
			request.setAttribute("message", true);

		}
		
		if ("Back".equals(action)) {
			System.out.println("Back block executed");
			request.setAttribute("message", false);

		}
		view = "/views/students/update_student.jsp";

		getServletContext().getRequestDispatcher(view).forward(request, response);

	}

}

package com.kodecamp.students;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentListServlet extends HttpServlet {

	public StudentListServlet() {
		System.out.println("StudentListServlet Constructor called");
	}

	public void init() {
		System.out.println(" Studentlist servlet method init called");
	}

	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {

		String size = request.getParameter("size");
		String action = request.getParameter("action");
		String view = null;

		if (action == null) {

			
			getServletContext().getRequestDispatcher("/views/welcomepage.jsp").forward(request, response);
		}
		if (action.equals("Submit")) {
			
			
			int numberOfStudents = Integer.parseInt(size);
			request.setAttribute("studentList", students(numberOfStudents));
			view = "/views/studentlist.jsp";

		}

		getServletContext().getRequestDispatcher(view).forward(request, response);

	}

	private List<Student> students(int numberOfStudents) {

		System.out.println("students method executed");

		List<Student> studentList = new ArrayList<>();

		for (int i = 0; i < numberOfStudents; i++) {

			studentList.add(new Student("" + i, "name" + i, "address" + i, "course" + i));
		}

		return studentList;
	}

}

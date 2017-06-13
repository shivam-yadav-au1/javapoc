package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kodecamp.database.DBConnection;
import com.kodecamp.database.IDBConnection;
import com.kodecamp.students.IStudent;
import com.kodecamp.students.Student;
import com.sun.xml.internal.bind.v2.model.core.ID;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class AddNewStudent extends HttpServlet {

	public AddNewStudent() {

		System.out.println(" constructer : " + this.getClass().getName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet : " + this.getClass().getName());
		String action = request.getParameter("action");
		String view = "/views/students/new_student.jsp";
		boolean result = false;

		if ("Add".equals(action)) {
			System.out.println("Add block executed");

			String id = request.getParameter("rollno");
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String course = request.getParameter("course");

			System.out
					.println("Value of fields are : " + id + " " + action + " " + name + " " + address + " " + course);

			try {

				IStudent student = new Student(Integer.parseInt(id), name, address, course);
				result = addStudent(student);

			} catch (Exception ex) {

				System.out.println("Fields are empty.");

			}

			System.out.println("value of boolean : " + result);

			if (result) {
				request.setAttribute("message", "success");
			} else {
				request.setAttribute("message", "error");
			}

		}
		if ("Back".equals(action)) {

			System.out.println("Back block executed");

			view = "/views/input.jsp";

		}

		getServletContext().getRequestDispatcher(view).forward(request, response);

	}

	public boolean addStudent(final IStudent student) {

		int id = student.getId();
		String name = student.getName();
		String address = student.getAddress();
		String course = student.getCourse();
		String query = "insert into students values('" + id + "','" + name + "','" + address + "','" + course + "');";

		IDBConnection connection = new DBConnection();
		boolean result = connection.insertStudentRecord(query);

		return result;

	}

	// http://localhost:8080/javapoc/students/new?rollno=12&name=aditya&address=mau&course=msc&action=Add

}

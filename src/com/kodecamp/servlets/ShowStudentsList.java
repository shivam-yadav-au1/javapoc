package com.kodecamp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kodecamp.students.Student;

public class ShowStudentsList extends HttpServlet{
	
	public ShowStudentsList (){
		
	}
	
	protected void doGet(final HttpServletRequest request,final HttpServletResponse response)
	throws ServletException ,IOException
	{
		
		String view = null;
		String size = request.getParameter("size") == null ? (String) request.getAttribute("size") : 
			request.getParameter("size");
		
		request.setAttribute("studentList", students(Integer.parseInt(size)));
		view = "/views/studentlist.jsp";
		getServletContext().getRequestDispatcher(view).forward(request, response);
	}
	
	private List<Student> students(int numberOfStudents) {

		System.out.println("students method executed");

		List<Student> studentList = new ArrayList<>();

		for (int i = 0; i < numberOfStudents; i++) {

			studentList.add(new Student( i, "name" + i, "address" + i, "course" + i));
		}

		return studentList;
	}

}

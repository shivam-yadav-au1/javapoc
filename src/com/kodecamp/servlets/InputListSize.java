package com.kodecamp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kodecamp.database.DBConnection;
import com.kodecamp.database.IDBConnection;
import com.kodecamp.students.IStudent;
import com.kodecamp.students.Student;

public class InputListSize extends HttpServlet{
	
	public InputListSize(){
		System.out.println("InputListSize servlet executed");
	}
	
	protected void doGet(final HttpServletRequest request,final HttpServletResponse response )
	throws ServletException ,IOException
	{	
		String view = null;
		String action = request.getParameter("action");
		
		String size = request.getParameter("size") == null ? (String) request.getAttribute("size") : request.getParameter("size");
		
		size = size == null ? "0" : size;
	//	String size = "5";
	//	System.out.println("value of size  "+size);
	
			
		view = "/views/input.jsp";
		System.out.println("action "+action);
		
		if("Submit".equals(action)){
		//	List<Student> studentList = students(Integer.parseInt(size));
			List<IStudent> studentList = listOfStudents();
			request.setAttribute("studentList", studentList);
			view = "/views/studentlist.jsp";
			
		}
		 
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
	private List<IStudent> listOfStudents(){
		
		IDBConnection dbConnection = new DBConnection();
		
		return dbConnection.getTableData("select * from STUDENTS ;");
		
	}

}

// http://localhost:8080/javamvc.http/studentList?action=Submit
// http://localhost:8080/javamvc.http/studentList?action=Submit
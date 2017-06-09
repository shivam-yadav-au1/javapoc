package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class AddNewStudent extends HttpServlet {

	public AddNewStudent() {

		System.out.println(" constructer : " + this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doGet : " + this.getClass().getName());
		
		String action = request.getParameter("action");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String course = request.getParameter("course");
		String view = null;
		
		System.out.println("Value of fields are : "+action+" "+name+" "+address+" "+course);
		
		
		if("Add".equals(action)){
			System.out.println("Add block executed");
			request.setAttribute("message", true);
			
			
		}
		if("Back".equals(action)){
			System.out.println("Back block executed");
			request.setAttribute("message", false);
			
		}
		view = "/views/students/new_student.jsp";
		
		getServletContext().getRequestDispatcher(view).forward(request, response);

	}

}

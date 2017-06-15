package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	public Login(){
		
		System.out.println("Constructor : "+this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("doGet() : "+this.getClass().getName());
		
		String action = req.getParameter("action");
		
		String view = "/views/input.jsp";
		
		
		if("login".equals(action)){
			
			System.out.println("Value of action :"+action);
			
			getServletContext().getRequestDispatcher(view).forward(req, resp);
			
			System.out.println("Request dispatched ");
			
		}
		if("register".equals(action)){
			
		}
		
	}
	
	

}

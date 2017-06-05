package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegisterServlet extends HttpServlet{

	public UserRegisterServlet(){
		
		System.out.println("UserRegisterServlet Constructor");
	}
	
	public void init(){
		System.out.println("method:init");
	}
	
	public void doGet(final HttpServletRequest request,final HttpServletResponse response)throws ServletException,IOException{
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String action = request.getParameter("action");
		
		if(action.equals("Register")){
			
			// do something
		}
		else{
			// do something
		}
		
	}
}

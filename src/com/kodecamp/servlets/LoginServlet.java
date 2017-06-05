package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public LoginServlet(){
		
		System.out.println("Login Constructor Called");
	}
	
	public void init(){
		System.out.println("method:init");
	}
	
	protected void doGet(final HttpServletRequest request,final HttpServletResponse response)throws ServletException,IOException{
		
		String name = request.getParameter("name");
		String password  = request.getParameter("password");
		String action = request.getParameter("action");
		String view = null;
		
		if(action == null){
			
	
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		}
		
		if(action.equals("Login")){
			
			boolean status = login(name,password);
			if(status == true){
				
			//	request.setAttribute("welcomeMessage", "Welcome "+name);
				view = "/views/welcomepage.jsp";
				
			}
			else{
				request.setAttribute("welcomeMessage","User Name or Password Wrong");
				view = "/views/login.jsp";
			}
		}
		
		if(action.equals("Register")){
			
			request.setAttribute("message", "Welcome to Registeration Page");
			view = "/views/form.jsp";
		}
		
		getServletContext().getRequestDispatcher(view).forward(request,response);
		
	}

	private boolean login(String name, String password) {
		
		boolean flag = false;
		
		if(name.equals("shivam") && password.equals("1334210049")){
			
			flag = true;
		}
		else{
			flag =  false;
		}
		
		return flag;
	}

}

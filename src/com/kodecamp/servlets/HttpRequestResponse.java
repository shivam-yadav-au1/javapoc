package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpRequestResponse extends HttpServlet{
	
	public HttpRequestResponse(){
		
		System.out.println("Constructor");
		
	}

	public void init(){
		System.out.println("method : init");
	}
	
	protected void doGet(final HttpServletRequest request,final HttpServletResponse response)
	throws ServletException,IOException
	{
		System.out.println("method : doGet");
		forwardRequest(request,response);
	}

	private void forwardRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		getServletContext().getRequestDispatcher("/views/form.jsp").forward(request, response);
	}
}

package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormInputServlet extends HttpServlet {

protected void doGet(final HttpServletRequest request,final HttpServletResponse response) throws ServletException,IOException {

								String action = request.getParameter("action");
								String name = request.getParameter("name");
								String rollno = request.getParameter("rollno");
								String course = request.getParameter("course");
								String address = request.getParameter("address");

								if(action.equals("Save")) {

																request.setAttribute("message", "Save Button Clicked");
								}
								if(action.equals("Cancel")) {

																request.setAttribute("message", "Cancel Button Clicked");
								}

}
}

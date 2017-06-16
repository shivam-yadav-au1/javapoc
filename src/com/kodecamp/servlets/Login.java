package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

	public Login() {

		System.out.println("Constructor : " + this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("doGet() : " + this.getClass().getName());

		String action = req.getParameter("action");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// default value of view
		String view = "";

		System.out.println("Value of action : " + action);

		if ("login".equals(action)) {

			System.out.println("Value of action :" + action);

			boolean result = validate(username, password);
			view = result ? "/views/input.jsp":view;
			HttpSession session = req.getSession();
			System.out.println("Value of session : "+session);
			session.setAttribute("name", username);
		}
		if ("register".equals(action)) {

			System.out.println("Value of action :" + action);

		}

		getServletContext().getRequestDispatcher(view).forward(req, resp);

	}

	private boolean validate(final String username, final String password) {
		return "admin".equals(username) && "admin".equals(password) ? true : false;
	}

}
// http://localhost:8080/javapoc/students/new

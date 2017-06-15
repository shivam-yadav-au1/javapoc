package com.kodecamp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {
	
	
	public AuthenticationFilter(){
		
		System.out.println("Constructor : "+this.getClass().getName());
		
	}
	
	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		System.out.println("Filter init() ");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("doFilter() : "+this.getClass().getName());

		HttpServletResponse resp = (HttpServletResponse) response;
		// Set standard HTTP/1.1 no-cache headers.
		resp.setHeader("Cache-Control", "private ,no-store, no-cache, nust-revalidate");
		// Set standard HTTP/1.8 no-cache header.
		resp.setHeader("Pragma", "no-cache");

		HttpServletRequest reqs = (HttpServletRequest) request;
		HttpSession session = reqs.getSession(true);
		System.out.println("Authentication Filter session : "+session);
		
		if(session == null){
			request.getRequestDispatcher("/").forward(reqs, response);
			
		}else{
			
			String userName = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(userName.equals("admin") && password.equals("admin")){
				
				System.out.println("Login successful");
				
				session.setAttribute("userName", userName);
				session.setAttribute("password", password);
				session.setMaxInactiveInterval(120);
				
				chain.doFilter(reqs, response);
				
			}
			else{
				
				request.getRequestDispatcher("/").forward(reqs, response);
			}
		}

	}

	@Override
	public void destroy() {

	}

}

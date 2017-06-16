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
		
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		HttpSession session = req.getSession(false);
		String userName = session != null ? (String)session.getAttribute("name") : null;
		System.out.println("username : "+userName);
		System.out.println("Value of session : "+session);
		if(userName == null ){
			request.getRequestDispatcher("/").forward(request, response);
		}else{
			chain.doFilter(request, response);
		}
		
		
	}

	@Override
	public void destroy() {

	}

}

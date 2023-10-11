package com.jdc.hello;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "hello", urlPatterns = "/servlet",loadOnStartup = 1)
public class HelloServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello Constructor");
	}
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
	
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException, IOException {
		log("service()");
		resp.getWriter().append("<h1>Hello Sevlet</h1>");
	}

}

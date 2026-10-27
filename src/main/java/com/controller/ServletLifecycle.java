package com.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifecycle extends HttpServlet {

	// The static initialization of a class happens before the first object of that class is constructed
	// The static block is used to configure something that needs to done before we crate an obj of that class
	// static runs only once.
	static {
		System.out.println("Servlet Loading");
	}
		
    public ServletLifecycle() {
    	System.out.println("Servlet Instantiation");
    }

    // In init() we pass a ServletConfig obj, because if we want to do something like build Connection before
    // service, then we can get the attribute's values from web.xml for this Servlet through ServletConfig or 
    // ServletContext
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Resource Allocation");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service");
	}

	public void destroy() {
		System.out.println("Resource Dellocation");
	}
}

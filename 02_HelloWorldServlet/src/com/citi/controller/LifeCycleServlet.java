package com.citi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	
       private String userName;
    public LifeCycleServlet() {
      System.out.println("Life cycle Servlet object created");
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method called");
	}
	
	public void destroy() {
		System.out.println("destroy method called");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service method called");
		
		userName = request.getParameter("txtName");
		

		PrintWriter out = response.getWriter();

		out.print("Name :: " + userName);
	}

}

package com.citi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NavigationServlet
 */
@WebServlet("/NavigationServlet")
public class NavigationServlet extends HttpServlet {
	
	private String pageName;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		pageName = request.getParameter("page");

		if (pageName.equals("pageOne")) {
			//response.sendRedirect("pageOne.html");
			//response.sendRedirect("PageOneServlet");
			RequestDispatcher dispatcher = request.getRequestDispatcher("PageOneServlet");			
			dispatcher.forward(request, response);
		}
		if (pageName.equals("pageTwo")) {
			//response.sendRedirect("pageTwo.html");
			//response.sendRedirect("PageTwoServlet");
			RequestDispatcher dispatcher = request.getRequestDispatcher("PageTwoServlet");
			dispatcher.forward(request, response);
		}
	}

}

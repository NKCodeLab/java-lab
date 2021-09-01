package com.citibank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NavigationServlet
 */
@WebServlet("/NavigationServlet")
public class NavigationServlet extends HttpServlet {
	private String action;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		action = request.getParameter("action");
		if (action.equals("Add New Employee")) {
			response.sendRedirect("AddNewEmployee.jsp");
		}
		if (action.equals("Update")) {

		}
		if (action.equals("Delete")) {
			int employeeId = Integer.valueOf(request.getParameter("rdoEmployee"));

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("empId", employeeId);

			response.sendRedirect("DeleteEmployeeServlet");
		}

	}
	
}

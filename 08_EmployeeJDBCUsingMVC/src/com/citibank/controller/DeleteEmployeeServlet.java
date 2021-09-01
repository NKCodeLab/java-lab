package com.citibank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.citibank.dao.EmployeeDAO;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();

		int employeeId = Integer.valueOf(httpSession.getAttribute("empId").toString());

		//System.out.println("Employee to be deleted :: " + employeeId);
		
		EmployeeDAO dao = new EmployeeDAO();
		
		if(dao.deleteEmployee(employeeId)) {
			response.sendRedirect("AdminHome.jsp");
		}
		else {
			response.sendRedirect("ErrorPage.html");
		}
	}

}

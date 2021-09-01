package com.citibank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.citibank.dao.EmployeeDAO;
import com.citibank.model.Employee;

@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {
	private int employeeId;
	private String name;
	private double salary;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		employeeId = Integer.valueOf(request.getParameter("txtEmployeeId"));
		name = request.getParameter("txtName");
		salary = Double.valueOf(request.getParameter("txtSalary"));

		Employee employee = new Employee(employeeId, name, salary);

		EmployeeDAO dao = new EmployeeDAO();
		if (dao.addNewEmployee(employee)) {
			response.sendRedirect("AdminHome.jsp");
		} else {
			response.sendRedirect("ErrorPage.html");
		}
	}

}
package com.citi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	

	private PrintWriter out;
	private double number1, number2, result;
	private String operation;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		out = response.getWriter();
		number1 = Double.valueOf(request.getParameter("txtNumber1"));
		number2 = Double.valueOf(request.getParameter("txtNumber2"));
		operation = request.getParameter("operation");
		
		switch (operation) {
		case "+":
			out.println("Result is "+ (number1+number2));
			break;
		case "-":
			out.println("Result is "+ (number1-number2));
			break;
		case "*":
			out.println("Result is "+ (number1*number2));
			break;
		case "/":
			out.println("Result is "+ (number1/number2));
			break;
		}
	}

}

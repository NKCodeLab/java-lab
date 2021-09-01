package com.citibank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBConnectionTestServlet")
public class DBConnectionTestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			//this class loads driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root",
					"SQLRoot123$");
			if (connection != null) {
				out.println("Connection success!");
				connection.close();
			} else {
				out.println("Connection Failed");
			}
		} catch (SQLException | ClassNotFoundException e) {

			out.println("Exception  :: " + e.getMessage());
		}
	}

}

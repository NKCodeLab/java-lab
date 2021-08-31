package com.citi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetailsServlet
 */
@WebServlet("/UserDetailsServlet")
public class UserDetailsServlet extends HttpServlet {	
       
	private PrintWriter out;
	private String userId;
	private String name;
	private String gender;
	private String qualification;
	private String address;
	private String[] languages;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		userId = request.getParameter("txtUserId");
		name = request.getParameter("txtUserName");
		gender = request.getParameter("rdoGender");
		qualification = request.getParameter("ddlQualification");
		address = request.getParameter("txaAddress");
		languages = request.getParameterValues("ckbLanguage");
		
		out.println("User Id : " + userId);
		out.println("Name : " + name);
		out.println("Gender : " + gender);
		out.println("Qualification : " + qualification);
		out.println("Address: " + address);
		for (String language : languages) {
			out.println(language);
		}

	}

}

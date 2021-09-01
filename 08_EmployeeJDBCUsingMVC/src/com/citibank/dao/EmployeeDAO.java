package com.citibank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.model.Employee;

public class EmployeeDAO {
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String user = "root";
	private String password = "SQLRoot123$";
	private String driverName = "com.mysql.cj.jdbc.Driver";
	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private List<Employee> employees;

	public List<Employee> getAllEmployees() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				sql = "select * from employee_details";
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				employees = new ArrayList();
				while (resultSet.next()) {
					Employee employee = new Employee();

					employee.setEmployeeId(resultSet.getInt("employee_id"));
					employee.setName(resultSet.getString("name"));
					employee.setSalary(resultSet.getDouble("salary"));

					employees.add(employee);

				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return employees;
	}

	public boolean addNewEmployee(Employee employee) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				sql = "insert into employee_details values(?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, employee.getEmployeeId());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setDouble(3, employee.getSalary());

				if (preparedStatement.executeUpdate() > 0) {
					return true;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	public boolean deleteEmployee(int employeeId) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				sql = "delete from employee_details where employee_id=?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, employeeId);

				if (preparedStatement.executeUpdate() > 0) {
					return true;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}
}

package com.controller;

import java.io.IOException;
import java.util.List;

import com.dao.EmployeeDAO;
import com.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> allEmployees = employeeDAO.getAllEmployees();
		
		req.setAttribute("empList", allEmployees);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("employees.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}

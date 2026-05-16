package com.controller;

import java.io.IOException;

import com.dao.EmployeeDAO;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNum = req.getParameter("phoneNum");
		int salary =Integer.parseInt(req.getParameter("salary"));
		
		Employee emp = new Employee(name, email, phoneNum, salary);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(emp);
		
		resp.sendRedirect("employees");
		
	}
}

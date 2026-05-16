package com.controller;

import java.io.IOException;

import com.dao.EmployeeDAO;
import com.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId= Integer.parseInt(req.getParameter("id"));
		EmployeeDAO emp = new EmployeeDAO();
		Employee empById = emp.getEmpById(empId);
		
		req.setAttribute("emp", empById);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateEmployee.jsp");
		requestDispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int empId =Integer.parseInt(req.getParameter("empId"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNum = req.getParameter("phoneNum");
		int salary =Integer.parseInt(req.getParameter("salary"));
		
		Employee emp = new Employee(empId, name, email, phoneNum, salary);
		
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.updateEmployee(emp);
		
		resp.sendRedirect("employees");
		
	}

}

package com.controller;

import java.io.IOException;

import com.dao.EmployeeDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId = Integer.parseInt(req.getParameter("id"));
		
		EmployeeDAO empDelete = new EmployeeDAO();
		empDelete.deleteEmpById(empId);
		
		resp.sendRedirect("employees");
	}
}

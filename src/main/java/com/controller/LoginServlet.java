package com.controller;

import java.io.IOException;

import com.dao.AdminDAO;
import com.model.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

	@WebServlet("/login")
	public class LoginServlet extends HttpServlet{


		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			 String username = req.getParameter("username");
			 String password = req.getParameter("password");
			 
			 Admin admin = new Admin(username, password);
			 AdminDAO adminDAO = new AdminDAO();
			 boolean isVaild = adminDAO.validateAdmin(admin);
			
			 if(isVaild){
				 HttpSession session = req.getSession();
				 String[] split = username.split("@");
				 session.setAttribute("username", split[0]);
				 resp.sendRedirect("employees");
				 
			 }else {
				 RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
				 requestDispatcher.forward(req, resp);
			 }
		}
			
		}



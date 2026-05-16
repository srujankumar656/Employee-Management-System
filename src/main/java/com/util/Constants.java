package com.util;

public class Constants {

	public final static String USERNAME = "root";
	public final static String PASSWORD = "Password";
	public final static String URL = "jdbc:mysql://localhost:3306/webapps";
	
	public final static String INSERT_ADMIN = "Insert into admin(username,password) values(?,?)";
	
	public final static String SELECT_ADMIN = "select * from admin where username = ? and password = ?";
	
	public final static String SELECT_EMPLOYEE = "select * from employee";
	
	public static final String SAVE_EMPLOYEE = "Insert into Employee(emp_name,email,phoneNum,salary) values(?,?,?,?)";
	
	public static final String DELETE_EMPLOYEE = "Update Employee set isActive = ? where Emp_Id = ?";
	
	public static final String SELECT_EMPLOYEE_BYID = "Select * From Employee where emp_id = ?";
	public static final String UPDATE_EMPLOYEE = " Update employee set emp_name =?, email = ?, phoneNum = ?, salary = ? where emp_id = ?";
	
}

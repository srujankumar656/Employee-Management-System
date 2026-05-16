package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.util.Constants;
import com.util.DbConnection;


public class EmployeeDAO {

	public List<Employee> getAllEmployees(){
		
		
	   Connection connection;
	   
	   List<Employee> empList = new ArrayList<Employee>();
	
	try {
		connection = DbConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constants.SELECT_EMPLOYEE);

		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			
			int id = resultSet.getInt("emp_id");
			String name = resultSet.getString("emp_name");
			String email = resultSet.getString("email");
			String phoneNum = resultSet.getString("phoneNum");
			int salary = resultSet.getInt("salary");
			boolean isActive = resultSet.getBoolean("isActive");
			
			Employee emp = new Employee(id, name, email, phoneNum, salary, isActive);
			empList.add(emp);
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return empList;
}
	
	public void saveEmployee(Employee emp) {
		
		try {
			Connection connection = DbConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SAVE_EMPLOYEE);
			statement.setString(1, emp.getName());
			statement.setString(2, emp.getEmail());
			statement.setString(3, emp.getPhoneNum());
			statement.setInt(4, emp.getSalary());
			
			statement.executeUpdate();
			
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

}

	public void deleteEmpById(int empId) {
		

		try {
			Connection connection = DbConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETE_EMPLOYEE);
			statement.setBoolean(1, false);
			statement.setInt(2, empId);
			
			statement.executeUpdate();
			
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

}

	public  Employee getEmpById(int empId) {
		
		Employee emp = null;
		try {
			Connection connection = DbConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.SELECT_EMPLOYEE_BYID);
			statement.setInt(1, empId);
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				
				int id = resultSet.getInt("emp_id");
				String name = resultSet.getString("emp_name");
				String email = resultSet.getString("email");
				String phoneNum = resultSet.getString("phoneNum");
				int salary = resultSet.getInt("salary");
				boolean isActive = resultSet.getBoolean("isActive");
				
				emp = new Employee(id, name, email, phoneNum, salary, isActive);
			}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return emp;		
	}

	public void updateEmployee(Employee emp) {
		
		try {
			Connection connection = DbConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_EMPLOYEE);
			statement.setString(1, emp.getName());
			statement.setString(2, emp.getEmail());
			statement.setString(3, emp.getPhoneNum());
			statement.setInt(4, emp.getSalary());
			statement.setInt(5, emp.getEmpId());
			
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

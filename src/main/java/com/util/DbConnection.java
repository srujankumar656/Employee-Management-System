package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	static Connection connection;

	public static Connection getConnection() throws SQLException{
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			if(connection == null) {
			connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
			return connection;
		}
			return connection;
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
		return null;
}
}

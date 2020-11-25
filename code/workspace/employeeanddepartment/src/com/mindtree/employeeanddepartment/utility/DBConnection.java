package com.mindtree.employeeanddepartment.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection con;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/employeemanagement";
		String username="root";
		String pass="Welcome";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
			{
				System.out.println("connection is established successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("connection falied");
		}
		
		return con;
		
	}

}

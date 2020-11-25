package com.mindtree.flightBooking.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static Connection con;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/";
		String username="root";
		String pass="Welcome";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
			{
				System.out.println("connection established successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("connection failed");
			
		}
		return con;
		
		
	}
	

}

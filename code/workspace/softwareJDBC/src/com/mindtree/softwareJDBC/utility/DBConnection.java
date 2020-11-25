package com.mindtree.softwareJDBC.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection con;
	public static Connection setConnection()
	{
		String url="jdbc:mysql://localhost:3306/softwaremanagement";
		String username="root";
		String pass="Welcome123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
			{
			System.out.println("connection successfull");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("connection falied");
			
		}
		return con;
		
		
	}
	

}

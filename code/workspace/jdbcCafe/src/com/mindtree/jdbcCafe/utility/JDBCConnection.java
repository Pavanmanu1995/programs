package com.mindtree.jdbcCafe.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
private static Connection con;
	
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/cafemanagement";
		String username="root";
		String pass="Welcome123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
			{
				System.out.println("connection established");
			}
		
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("falied to connect");
		}
		return con;
			
		
	}

}

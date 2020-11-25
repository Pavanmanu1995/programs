package com.mindtree.railwayticketbookingsystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static Connection con;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/railwaybooking";
		String userName="root";
		String pass="Welcome123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,pass);
			if(con!=null)
			{
				System.out.println("connection is established successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("falied to connect");
		}
		
		return con;
	}
	

}

package com.mindtree.watchStore.utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static Connection con;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/watchmanagement";
		String username="root";
		String pass="Welcome123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
			{
				System.out.println("Connection established successfully");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}

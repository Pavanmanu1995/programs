package utilities;

import java.sql.*;

public class JdbcConnection {
	
	static Connection connection = null;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/banks";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "Welcome123";
	   
	public static Connection getConnection()
	{
		try
		{
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection()
	{
		try
		{
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

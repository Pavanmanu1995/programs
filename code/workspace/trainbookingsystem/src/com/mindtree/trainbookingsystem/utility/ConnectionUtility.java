package com.mindtree.trainbookingsystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

	public Connection connection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/trainbookingsystem";
		String username = "root";
		String password = "Welcome123";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

			if (con != null) {
				System.out.println("Database Connected");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;

	}
}

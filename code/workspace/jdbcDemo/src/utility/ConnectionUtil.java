package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exception.ConnectionFailedException;

public class ConnectionUtil {

	// private static final String DRIVER = "com.mysql.jdbc.Driver";
	// Creating constants
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Welcome123";

	// Method to create and return "Connection" object
	public Connection getConnection() throws SQLException {
		// Creating Connection object
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (SQLException e) {
			throw new SQLException(e);
		}

		return con;
	}

	public void closeConnection(Connection con) throws ConnectionFailedException {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new ConnectionFailedException(e);
			}
		}
	}
}
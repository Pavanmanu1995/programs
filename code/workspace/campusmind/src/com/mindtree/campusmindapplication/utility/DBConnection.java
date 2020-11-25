package com.mindtree.campusmindapplication.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.campusmindapplication.exception.util.CampusmindUtilException;

public class DBConnection {

	private static Connection dbConnection;
	private static DBConnection instance;

	private DBConnection() {

	}

	public static void createConnection() throws CampusmindUtilException {

		try {
			Class.forName(Constants.DRIVER);
			dbConnection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
			if (dbConnection != null) {
				System.out.println("Connection established");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new CampusmindUtilException("Can't connect to network");
		}

	}

	public static DBConnection getInstance() {

		if (instance == null) {
			instance = new DBConnection();
		}

		return instance;

	}

	public Connection getConnection() {
		return dbConnection;
	}

	public static void closeConnection() throws CampusmindUtilException {
		try {
			if (dbConnection != null) {

				dbConnection.close();
			}
		} catch (SQLException e) {
			throw new CampusmindUtilException("Error in closing connection");
		}
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import exception.ConnectionFailedException;
import exception.EmployeeDaoException;
import utility.ConnectionUtil;


public class EmployeeDao implements EmployeeDaoInterface{
	// Create utility layer object which will be used to call utility method of
	// Connection creation
	ConnectionUtil cu = new ConnectionUtil();

	// method to pass employee object to database
	@Override
	public void insertEmployeeToDB(Employee e) throws EmployeeDaoException ,ConnectionFailedException{
	
		Connection con = null;
		try {
			// create connection object
			con = cu.getConnection();
		} catch (SQLException e1) {
			throw new ConnectionFailedException("Connection could not be established", e1);
		}
		// create query
		String query = "insert into employee values(?,?,?,?);";
		PreparedStatement ps = null;
		try {
			// create preparedStatement
			ps = con.prepareStatement(query);
			// get employee parameters and link it to PreparedStatement parameters
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getCountry());
			ps.execute();
		} catch (SQLException e1) {
			throw new EmployeeDaoException("Record insertion failed", e1);
		}

		// System.out.println("Connection created and added Employee details
		// successfully");
	}

	// method to fetch employee objects from database
	@Override
	public List<Employee> getAllEmployeesFromDB() {
		// create result holder(which is list of employees in this case)
		List<Employee> result = new ArrayList<>();
		Connection con = null;
		try {
			// create connection object
			con = cu.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// create query
		String query = "select * from employee;";
		Statement st = null;
		ResultSet rs = null;
		try {
			// create Statement object
			st = con.createStatement();
			// Execute statement and get ResultSet from it
			rs = st.executeQuery(query);

			// Traverse through ResultSet to get each record(each record or row is an
			// employee object)
			while (rs.next()) {

				// Create Employee object with properties from DB with help of ResultSet
				// Way 1
				/*
				 * Employee emp = new Employee(); emp.setId(rs.getInt(1));
				 * emp.setName(rs.getString(2)); emp.setEmail(rs.getString(3));
				 * emp.setCountry(rs.getString(4));
				 */

				// Way 2
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

				// Add Employee object to final result which will be returned from this method
				result.add(emp);
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// Return result(List of Employees)
		return result;

	}
}

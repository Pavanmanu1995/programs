package com.mindtree.softwareJDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.softwareJDBC.entity.Software;
import com.mindtree.softwareJDBC.exception.customs.SoftwareDaoException;
import com.mindtree.softwareJDBC.exception.customs.SoftwareServiceException;
import com.mindtree.softwareJDBC.utility.DBConnection;

public class SoftwareDaoImp implements ISoftwareDao {
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static Connection con=null;

	@Override
	public String addSoftware(Software software) throws SoftwareDaoException {
		con=DBConnection.setConnection();
		try {
			ps=con.prepareStatement("insert into software values(?,?,?,?)");
			ps.setInt(1,software.getId());
			ps.setString(2, software.getLicenseNumber() );
			ps.setString(3,software.getName());
			ps.setDouble(4, software.getCost());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			throw new SoftwareDaoException();
		}
		
		return "added successfully";
	}

	@Override
	public List<Software> getSoftware() throws SoftwareDaoException {
		List<Software> softwareList=new ArrayList<>();
		con=DBConnection.setConnection();
		try {
			ps=con.prepareStatement("select * from software");
			rs=ps.executeQuery();
			while(rs.next())
			{
				softwareList.add(new Software(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
			}
			return softwareList;
		} catch (SQLException e) {
			throw new SoftwareDaoException();
		}
		
	}

	@Override
	public String updateDetails(int id) throws SoftwareServiceException {
		con=DBConnection.setConnection();
		ps=con.prepareStatement("update software set id=? where name=?")
		return null;
	}
	

}

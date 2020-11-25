package com.mindtree.jdbcCafe.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.jdbcCafe.dao.ICafeDao;
import com.mindtree.jdbcCafe.entity.Cafe;
import com.mindtree.jdbcCafe.entity.CafeManager;
import com.mindtree.jdbcCafe.exception.CafeDaoException;
import com.mindtree.jdbcCafe.utility.JDBCConnection;

public class CafeDaoImpl implements ICafeDao {
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static Connection con=null;

	@Override
	public String addCafeManager(CafeManager manager) throws CafeDaoException {
		con=JDBCConnection.getConnection();
		try {
			ps=con.prepareStatement("insert into manager values(?,?,?)");
			ps.setInt(1,manager.getManagerId());
			ps.setString(2,manager.getManagername());
			ps.setDouble(3,manager.getManagerSalary());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			throw new CafeDaoException();
		}
		return "manager details added successfully";
	}

	@Override
	public String addCafe(Cafe cafe) throws CafeDaoException {
		con=JDBCConnection.getConnection();
		try {
			ps=con.prepareStatement("insert into cafe values(?,?,?,?)");
			ps.setInt(1,cafe.getCafeId());
			ps.setInt(2,cafe.getManagerId());
			ps.setString(3,cafe.getCafeName());
			ps.setDouble(4,cafe.getCafeRevenue());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			throw new CafeDaoException();
		}
		return "cafe details added successfully";
	}

	@Override
	public List<Cafe> getCafeDetails(int managerId) throws CafeDaoException {
		List<Cafe> cafeList = new ArrayList<>();
		
		con = JDBCConnection.getConnection();
			try {
				Statement stmt= con.createStatement();
				rs = ps.executeQuery("select cafrId,cafeName,cafeRevenue from cafe where managerId ="+managerId+";");
				while (rs.next()) {
					cafeList.add(new Cafe(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));		
			}
				return cafeList;
			}
				catch (SQLException e) {
				throw new CafeDaoException();
			}
			
		}

	}


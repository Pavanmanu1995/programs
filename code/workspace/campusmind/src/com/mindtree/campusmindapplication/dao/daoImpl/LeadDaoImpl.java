package com.mindtree.campusmindapplication.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindtree.campusmindapplication.dao.ILeadDao;
import com.mindtree.campusmindapplication.entity.Lead;
import com.mindtree.campusmindapplication.exception.dao.LeadDaoException;
import com.mindtree.campusmindapplication.utility.DBConnection;

public class LeadDaoImpl implements ILeadDao {

	DBConnection dbUtil = DBConnection.getInstance();

	@Override
	public Lead checkLeadDetail(int leadID) throws LeadDaoException {

		try {
			Connection con = dbUtil.getConnection();

			PreparedStatement ps;
			ResultSet rs;
			Lead leadDetail = new Lead();

			ps = con.prepareStatement("Select * from lead where leadID=?");
			ps.setInt(1, leadID);
			rs = ps.executeQuery();

			while (rs.next()) {
				leadDetail.setLeadID(rs.getInt(1));
				leadDetail.setLeadName(rs.getString(2));
				leadDetail.setCampusMindID(rs.getInt(3));
			}

			return leadDetail;

		} catch (SQLException e) {
			throw new LeadDaoException("Error while fetching lead details",e);
		}
	}

	@Override
	public int addLeadDetail(Lead lead) throws LeadDaoException {
		try {
			Connection con = dbUtil.getConnection();
			PreparedStatement ps;

			ps = con.prepareStatement("insert into lead values(?,?,?)");
			ps.setInt(1, lead.getLeadID());
			ps.setString(2, lead.getLeadName());
			ps.setInt(3, lead.getCampusMindID());

			int result = ps.executeUpdate();

			return result;
		} catch (SQLException e) {
			throw new LeadDaoException("Error in inserting lead data",e);
		}

	}
	

}

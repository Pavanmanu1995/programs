package com.mindtree.campusmindapplication.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.mindtree.campusmindapplication.dao.ICampusmindDao;
import com.mindtree.campusmindapplication.entity.CampusMind;
import com.mindtree.campusmindapplication.exception.dao.CampusmindDaoException;
import com.mindtree.campusmindapplication.utility.DBConnection;

public class CampusmindDaoImpl implements ICampusmindDao {

	private DBConnection dbUtil = DBConnection.getInstance();

	@Override
	public CampusMind checkCampusMindData(int campusmindId) throws CampusmindDaoException {
		try {
			Connection con = dbUtil.getConnection();
			PreparedStatement ps;
			ResultSet rs;
			CampusMind c = new CampusMind();

			ps = con.prepareStatement("select * from campusmind where campusmindID=?");
			ps.setInt(1, campusmindId);

			rs = ps.executeQuery();

			while (rs.next()) {
				c.setCampusMindID(rs.getInt(1));
				c.setCampusMindName(rs.getString(2));
				c.setAge(rs.getInt(3));
				c.setStateName(rs.getString(4));
				c.setCampusMindTrack(rs.getString(5));
			}
			return c;
		} catch (Exception e) {
			throw new CampusmindDaoException("Error in fetching the campusmind data", e);
		}

	}

	@Override
	public int addCampusMindData(CampusMind campusmind) throws CampusmindDaoException {
		try {
			Connection con = dbUtil.getConnection();
			PreparedStatement ps;
			ps = con.prepareStatement("insert into campusmind values(?,?,?,?,?)");
			ps.setInt(1, campusmind.getCampusMindID());
			ps.setString(2, campusmind.getCampusMindName());
			ps.setInt(3, campusmind.getAge());
			ps.setString(4, campusmind.getStateName());
			ps.setString(5, campusmind.getCampusMindTrack());

			int result = ps.executeUpdate();
			return result;

		} catch (Exception e) {
			throw new CampusmindDaoException("Error in inserting campusMind data !", e);
		}
	}

	@Override
	public List<CampusMind> getCampusMindData() throws CampusmindDaoException {
		Connection con = dbUtil.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		List<CampusMind> cList = new ArrayList<>();
		try {
			ps = con.prepareStatement("Select * from campusmind");
			rs = ps.executeQuery();

			while (rs.next()) {
				cList.add(
						new CampusMind(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
			}
			if (cList.isEmpty()) {
				return null;
			}
			return cList;
		} catch (SQLException e) {
			throw new CampusmindDaoException("Error in fetching campusMind data",e);
		}

	}

	@Override
	public int updateTrack(int campusmindId,String newTrack) throws CampusmindDaoException {
		Connection con = dbUtil.getConnection();
		PreparedStatement ps;
		
		try {
			ps=con.prepareStatement("update campusmind set campusmindTrack=? where campusmindID=?");
			ps.setString(1, newTrack);
			ps.setInt(2, campusmindId);
			int result=ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			throw new CampusmindDaoException("Error while updating campusMind data");
		}
	
	}

	@Override
	public int deleteCampusMind(int campusmindId) throws CampusmindDaoException {
		Connection con = dbUtil.getConnection();
		PreparedStatement ps;
		
		try {
			ps=con.prepareStatement("delete from campusmind where campusmindID=?");
			ps.setInt(1, campusmindId);
			int result=ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			throw new CampusmindDaoException("Error while deleting campusMind data from database");
		}
		
		
	}

	@Override
	public Map<String, CampusMind> getCampusmindGivenLead(String leadName) throws CampusmindDaoException {
		Map<String,CampusMind> map=new LinkedHashMap<>(); 
		Connection con = dbUtil.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps=con.prepareStatement("select * from campusmind inner join lead on campusmind.campusmindID=lead.campusmindID where lead.leadName=?");
			ps.setString(1, leadName);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				map.put(leadName, new CampusMind(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			return map;
		} catch (SQLException e) {
			throw new CampusmindDaoException(e.getMessage(),e);
		}
		
	}

}

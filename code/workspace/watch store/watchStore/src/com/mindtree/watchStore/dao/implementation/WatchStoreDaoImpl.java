package com.mindtree.watchStore.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.watchStore.dao.IWatchStoreDao;
import com.mindtree.watchStore.entity.Type;
import com.mindtree.watchStore.entity.Watch;
import com.mindtree.watchStore.exception.WatchStoreDaoException;
import com.mindtree.watchStore.exception.WatchStoreServiceException;
import com.mindtree.watchStore.service.IWatchStoreService;
import com.mindtree.watchStore.utility.JDBCConnection;

public class WatchStoreDaoImpl implements IWatchStoreDao {
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static Connection con = null;

	@Override
	public String addType(Type type) throws WatchStoreDaoException {
		con = JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("insert into type values(?,?)");
			ps.setInt(1, type.getTypeId());
			ps.setString(2, type.getTypeName());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			throw new WatchStoreDaoException();
		}

		return "type details added successfully";
	}

	@Override
	public String addWatch(Watch watch) throws WatchStoreDaoException {
		con = JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("insert into watch values(?,?,?,?)");
			ps.setInt(1, watch.getWatchId());
			ps.setInt(2, watch.getTypeId());
			ps.setString(3, watch.getModelNumber());
			ps.setDouble(4, watch.getPrice());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			throw new WatchStoreDaoException();
		}
		return "type details added successfully";
	}

	@Override
	public List<Watch> getBookingDetails(int id) throws WatchStoreDaoException {
		List<Watch> watchlist = new ArrayList<>();
		con = JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("select * from watch");
			rs = ps.executeQuery();
			while (rs.next()) {
				watchlist.add(new Watch(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4)));
			}

		} catch (SQLException e) {
			throw new WatchStoreDaoException();
		}
		return watchlist;
	}

	@Override
	public String deleteDetails(int typeid) throws WatchStoreDaoException {
		con = JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("delete from watch where typeid=?");
			ps.setInt(1, typeid);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			throw new WatchStoreDaoException();
		}
		return "details deleted successfully";
	}

}

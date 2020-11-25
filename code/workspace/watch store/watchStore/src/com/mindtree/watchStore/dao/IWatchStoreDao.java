package com.mindtree.watchStore.dao;

import java.util.List;

import com.mindtree.watchStore.entity.Type;
import com.mindtree.watchStore.entity.Watch;
import com.mindtree.watchStore.exception.WatchStoreDaoException;

public interface IWatchStoreDao {

	public String addType(Type type) throws WatchStoreDaoException;

	public String addWatch(Watch watch) throws WatchStoreDaoException;

	public List<Watch> getBookingDetails(int id) throws WatchStoreDaoException;

	public String deleteDetails(int typeid) throws WatchStoreDaoException;

}

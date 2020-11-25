package com.mindtree.watchStore.service;

import java.util.Comparator;
import java.util.List;

import com.mindtree.watchStore.entity.Type;
import com.mindtree.watchStore.entity.Watch;
import com.mindtree.watchStore.exception.WatchStoreServiceException;

public interface IWatchStoreService extends Comparator<Watch> {

	public String addType(Type type) throws WatchStoreServiceException;

	public String addWatch(Watch watch) throws WatchStoreServiceException;

	public List<Watch> getWatchDetails(int id) throws WatchStoreServiceException;

	public String deleteDetails(int typeid) throws WatchStoreServiceException;

}

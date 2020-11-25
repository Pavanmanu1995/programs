package com.mindtree.watchStore.service.implementation;

import java.util.Collections;
import java.util.List;

import com.mindtree.watchStore.dao.IWatchStoreDao;
import com.mindtree.watchStore.dao.implementation.WatchStoreDaoImpl;
import com.mindtree.watchStore.entity.Type;
import com.mindtree.watchStore.entity.Watch;
import com.mindtree.watchStore.exception.WatchStoreDaoException;
import com.mindtree.watchStore.exception.WatchStoreServiceException;
import com.mindtree.watchStore.service.IWatchStoreService;

public class WatchStoreServiceImpl implements IWatchStoreService {
	IWatchStoreDao dao=new WatchStoreDaoImpl();

	@Override
	public String addType(Type type) throws WatchStoreServiceException {
		
		try {
			String mess = dao.addType(type);
			return mess;
		} catch (WatchStoreDaoException e) {
			throw new  WatchStoreServiceException();
		}
		
	
	}

	@Override
	public String addWatch(Watch watch) throws WatchStoreServiceException {
		try {
			String mess = dao.addWatch(watch);
			return mess;
		} catch (WatchStoreDaoException e) {
			throw new  WatchStoreServiceException();
		}
	}

	@Override
	public int compare(Watch w1, Watch w2) {
		if (w1.getPrice() > w2.getPrice()) {
			return -1;
		} else if(w1.getPrice() < w2.getPrice()) {
			return 1;
		}
		return 0;
	}

	@Override
	public List<Watch> getWatchDetails(int id) throws WatchStoreServiceException {
		List<Watch> watch;
			try {
				watch = dao.getBookingDetails(id);
				IWatchStoreService obj = new WatchStoreServiceImpl();
				Collections.sort(watch, obj);
			
			} catch (WatchStoreDaoException e) {
				throw new WatchStoreServiceException();
			}
			return watch;
			
	}

	@Override
	public String deleteDetails(int typeid) throws WatchStoreServiceException {
		String mess;
		try {
			mess = dao.deleteDetails(typeid);
			return mess;
		} catch (WatchStoreDaoException e) {
			throw new WatchStoreServiceException();
			
		}
	}

}

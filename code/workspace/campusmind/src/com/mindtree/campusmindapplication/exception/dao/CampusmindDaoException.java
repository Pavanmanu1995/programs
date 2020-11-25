package com.mindtree.campusmindapplication.exception.dao;

import com.mindtree.campusmindapplication.exception.OrchardAppException;

public class CampusmindDaoException extends OrchardAppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CampusmindDaoException() {
	}

	public CampusmindDaoException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CampusmindDaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CampusmindDaoException(String arg0) {
		super(arg0);
	}

	public CampusmindDaoException(Throwable arg0) {
		super(arg0);
	}

}

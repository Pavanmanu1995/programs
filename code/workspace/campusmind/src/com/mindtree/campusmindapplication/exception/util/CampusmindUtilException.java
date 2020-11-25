package com.mindtree.campusmindapplication.exception.util;

import com.mindtree.campusmindapplication.exception.OrchardAppException;

public class CampusmindUtilException extends OrchardAppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CampusmindUtilException() {
	}

	public CampusmindUtilException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CampusmindUtilException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CampusmindUtilException(String arg0) {
		super(arg0);
	}

	public CampusmindUtilException(Throwable arg0) {
		super(arg0);
	}

}

package com.mindtree.campusmindapplication.exception.service;

public class CampusmindAlreadyExistsException extends CampusmindServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CampusmindAlreadyExistsException() {
	}

	public CampusmindAlreadyExistsException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CampusmindAlreadyExistsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CampusmindAlreadyExistsException(String arg0) {
		super(arg0);
	}

	public CampusmindAlreadyExistsException(Throwable arg0) {
		super(arg0);
	}

}

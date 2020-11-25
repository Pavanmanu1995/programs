package com.mindtree.campusmindapplication.exception.service;

public class LeadAlreadyExistsException extends LeadServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LeadAlreadyExistsException() {
	}

	public LeadAlreadyExistsException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public LeadAlreadyExistsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public LeadAlreadyExistsException(String arg0) {
		super(arg0);
	}

	public LeadAlreadyExistsException(Throwable arg0) {
		super(arg0);
	}

}

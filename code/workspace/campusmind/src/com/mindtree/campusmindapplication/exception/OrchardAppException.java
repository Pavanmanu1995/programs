package com.mindtree.campusmindapplication.exception;

public class OrchardAppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrchardAppException() {
		super();
	}

	public OrchardAppException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public OrchardAppException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public OrchardAppException(String arg0) {
		super(arg0);
	}

	public OrchardAppException(Throwable arg0) {
		super(arg0);
	}

}

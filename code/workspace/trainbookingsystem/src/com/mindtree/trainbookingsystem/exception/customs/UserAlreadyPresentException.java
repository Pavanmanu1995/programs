package com.mindtree.trainbookingsystem.exception.customs;

import com.mindtree.trainbookingsystem.exception.TrainBookingSystemDaoException;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemServiceException;

public class UserAlreadyPresentException extends TrainBookingSystemDaoException {

	public UserAlreadyPresentException() {
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
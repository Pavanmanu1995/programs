package com.mindtree.campusmindapplication.utility;

import com.mindtree.campusmindapplication.exception.util.CampusmindUtilException;

public class EstablishConnection {

	public EstablishConnection() {
		try {
			DBConnection.createConnection();
		} catch (CampusmindUtilException e) {
			System.out.println("Connection to database not established");
		}
	}

}

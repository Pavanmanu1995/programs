package com.mindtree.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			
			FileInputStream fout=new FileInputStream("D://employee.txt");
			ObjectInputStream in=new ObjectInputStream(fout);
			Employee e = (Employee)in.readObject();
			System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
		

	}
	

	}

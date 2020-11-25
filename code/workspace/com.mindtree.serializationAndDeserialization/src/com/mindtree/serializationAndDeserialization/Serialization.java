package com.mindtree.serializationAndDeserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		
		try {
			Employee employee=new Employee(1,"pavan",30000);
			FileOutputStream fout=new FileOutputStream("D://employee.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(employee);
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}

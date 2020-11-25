package com.mindtree.service;

import java.util.Comparator;
import java.util.List;

import com.mindtree.exception.LaptopServiceException;
import com.mindtree.exception.ModelNotFoundException;
import com.mindtree.laptop.entity.Laptop;

public interface ILaptopService extends Comparator<Laptop> {
	public String addLaptop(Laptop lap) throws LaptopServiceException;
	
	public List<Laptop> sortLaptop();
	
	public List<Laptop> displayLaptop(String model1) throws ModelNotFoundException;
	
	public List<Laptop> laptopBrand();
	

}

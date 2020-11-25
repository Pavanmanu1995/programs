package com.mindtree.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mindtree.exception.LaptopAlreadyPresentException;
import com.mindtree.exception.LaptopServiceException;
import com.mindtree.exception.ModelNotFoundException;
import com.mindtree.laptop.entity.Laptop;

public class LaptopServiceImplementation implements ILaptopService {
	static List<Laptop> list=new ArrayList<Laptop>();

	@Override
	public String addLaptop(Laptop lap) throws LaptopServiceException {
		try
		{
			for(Laptop l:list)
			{
				if(l.getSerialNumber()==lap.getSerialNumber())
					throw new LaptopAlreadyPresentException("laptop serial number already present");
			}
		}
		catch(LaptopServiceException e)
		{
			throw new LaptopServiceException(e.getMessage());
		}
		list.add(lap);
		return "laptop added sucessfully";
	}

	@Override
	public int compare(Laptop lap1, Laptop lap2) {
		if(lap1.getPrice()>lap2.getPrice())
		{
			return 1;
		}
		else if(lap1.getPrice()<lap2.getPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public List<Laptop> sortLaptop() {
		List<Laptop> temp=list;
		ILaptopService obj = new LaptopServiceImplementation();
		Collections.sort(temp, obj);
		return temp;
	}

	@Override
	public List<Laptop> displayLaptop(String model1) throws ModelNotFoundException {
		Laptop temp=null;
		List<Laptop> temp1=new ArrayList<>();
		for(Laptop lap:list)
		{
			if(lap.getModel().equalsIgnoreCase(model1))
			{
				temp=lap;
				temp1.add(temp);
				
			}
		}
		try
		{
			if(temp==null)
				throw new LaptopServiceException("the model number not present");
		}
		catch(LaptopServiceException e)
		{
			System.out.println(e.getMessage());
		}
		return temp1;
	}

	@Override
	public List<Laptop> laptopBrand() {
		for(Laptop lap:list)
		{
			if(lap.getModel()>=3)
			{
				
			}
		}
		return null;
	}


}

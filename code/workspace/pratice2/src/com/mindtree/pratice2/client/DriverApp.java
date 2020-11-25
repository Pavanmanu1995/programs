package com.mindtree.pratice2.client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.mindtree.pratice2.entity.Block;
import com.mindtree.pratice2.entity.City;
import com.mindtree.pratice2.service.CityBlockImpl;
import com.mindtree.pratice2.service.ICityBlock;

public class DriverApp {
	
	static Scanner sc= new Scanner(System.in);
	static Map<City,Set<Block>> cityblock = new TreeMap<City,Set<Block>>();
	static ICityBlock icityblock=new CityBlockImpl(); 

	public static void main(String[] args) {
		boolean flag=true;
		do
		{
			System.out.println("1.enter the city and block");
			System.out.println("2.display");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter number of cities");
				int num=sc.nextInt();
				for(int i=0;i<num;i++)
				{
				System.out.println("enter the city id");
				int cityId=sc.nextInt();
				System.out.println("enter the city name");
				String cityName=sc.next();
				City city = new City(cityId,cityName);
				
				System.out.println("enter number of blocks");
				int blockNum=sc.nextInt();
				Set<Block> block=new HashSet<Block>();
				for(int j=0;j<blockNum;j++)
				{
					System.out.println("enter the block id");
					int blockId=sc.nextInt();
					System.out.println("enter the block name");
					String blockName=sc.next();
					Block block1 =new Block(blockId,blockName);
					block.add(block1);
					
				}
				cityblock.put(city, block);
				}
				break;
				
			case 2:
				Map<City,Set<Block>> map = icityblock.sortData(cityblock);
				Iterator<Map.Entry<City,Set<Block>>> blockcity =map.entrySet().iterator();
				while(blockcity.hasNext())
				{
					Map.Entry<City, Set<Block>> entry = blockcity.next();
					System.out.println("city" + entry.getKey() + "block" + entry.getValue());
				}
				break;
			}
		}
		while(flag);
		
		
		

	}

}

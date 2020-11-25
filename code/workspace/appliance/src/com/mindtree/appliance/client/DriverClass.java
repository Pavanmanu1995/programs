package com.mindtree.appliance.client;

import com.mindtree.appliance.entity.*;
import com.mindtree.appliance.service.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Appliance> a1 = new ArrayList<Appliance>();
		Appliance obj1 = new Appliance();
		Service s = new Service();
		boolean flag = true;
		do {
			System.out.println("1. Add 5 appliances");
			System.out.println("2. Sort appliances based on price");
			System.out.println("3. Display appliances starting with A");
			System.out.println("4. Display");
			System.out.print("Enter choice:-");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter id");
				int id = scan.nextInt();
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter price");
				int price = scan.nextInt();
				s.addAppliances(a1, id, name, price);
				break;
			case 2:
				System.out.println("sort the price ");
				Collections.sort(a1, s);
				for (Appliance appliance : a1)
					System.out.println(appliance.getApplianceId() + " " + appliance.getApplianceName() + " "
							+ appliance.getAppliancePrice());
			case 3:
				try {
					s.display(a1);
				} catch (Exception e) {
					System.out.println("exception not found");
				}
				break;
			case 4:
				List<Appliance> result = s.display(a1);

				System.out.println(result.toString());
				break;

			}
		} while (flag);
	}

}

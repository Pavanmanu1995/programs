package com.mindtree.appliance.service;

import java.util.Comparator;
import java.util.List;

import com.mindtree.appliance.entity.Appliance;

//import com.mindtree.appliance.entity.Appliance;

public class Service implements Comparator<Appliance> {
	int price;

	public void addAppliances(List<Appliance> a1, int id, String name, int price) {
		Appliance a = new Appliance(id, name, price);
		a1.add(a);
	}

	public int compare(Appliance ap1, Appliance ap2) {
		if (ap1.getAppliancePrice() < ap2.getAppliancePrice())
			return -1;
		if (ap1.getAppliancePrice() > ap2.getAppliancePrice())
			return 1;
		else
			return 0;
	}

	public List<Appliance> display(List<Appliance> a1) {
		for (Appliance ap : a1) {
			try {
				char ch = ap.getApplianceName().charAt(0);
				if (ch == 'A' || ch == 'a') {
					System.out.println(ap.getApplianceName());
				}
			} catch (Exception e) {
				System.out.println("NullPointerExecption");

			}
		}
		return a1;
	}
}

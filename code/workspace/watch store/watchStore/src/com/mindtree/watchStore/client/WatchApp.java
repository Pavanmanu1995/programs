package com.mindtree.watchStore.client;

import java.util.List;
import java.util.Scanner;

import com.mindtree.watchStore.entity.Type;
import com.mindtree.watchStore.entity.Watch;
import com.mindtree.watchStore.exception.WatchStoreServiceException;
import com.mindtree.watchStore.service.IWatchStoreService;
import com.mindtree.watchStore.service.implementation.WatchStoreServiceImpl;

public class WatchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IWatchStoreService service = new WatchStoreServiceImpl();
		Type type = new Type();
		boolean flag = true;
		do {
			System.out.println("1.Add Type");
			System.out.println("2.Add watch");
			System.out.println("3.Sort all the watches based on price");
			System.out.println("4.Delete particular type");
			System.out.println("5.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the type Id");
				int typeId = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the type name");
				String typeName = sc.nextLine();
				type = new Type(typeId, typeName);
				try {
					String mess = service.addType(type);
					System.out.println(mess);
				} catch (WatchStoreServiceException e) {
					System.out.println("something went wrong");
				}
				break;
			case 2:
				System.out.println("enter number of watch to the type");
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {
					System.out.println("enter the watch Id");
					int watchId = sc.nextInt();
					sc.nextLine();
					System.out.println("enter the watch model number");
					String modelNumber = sc.nextLine();
					System.out.println("enter the watch price");
					double price = sc.nextDouble();
					Watch watch = new Watch(watchId, type.getTypeId(), modelNumber, price);
					try {
						String mess = service.addWatch(watch);
						System.out.println(mess);
					} catch (WatchStoreServiceException e) {
						System.out.println("something went wrong");
					}

				}
				break;
			case 3:
				System.out.println("Enter watch id");
				int id = sc.nextInt();
				List<Watch> watch;
				try {
					watch = service.getWatchDetails(id);
					System.out.println("Showing the watch details");
					for (Watch w : watch) {
						System.out.println(w.toString());
					}

				} catch (WatchStoreServiceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("enter the type id to delete");
				int typeid = sc.nextInt();
				String mess;
				try {
					mess = service.deleteDetails(typeid);
					System.out.println(mess);
				} catch (WatchStoreServiceException e) {
					System.out.println("something went wrong");
				}
				break;
			case 5:
				System.out.println("exited");
				flag = false;
			}
		} while (flag);

	}

}

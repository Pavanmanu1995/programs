package com.mindtree.campusmindapplication.client;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.mindtree.campusmindapplication.entity.CampusMind;
import com.mindtree.campusmindapplication.entity.Lead;
import com.mindtree.campusmindapplication.exception.OrchardAppException;
import com.mindtree.campusmindapplication.exception.service.CampusmindServiceException;
import com.mindtree.campusmindapplication.exception.service.LeadServiceException;
import com.mindtree.campusmindapplication.service.ICampusmindService;
import com.mindtree.campusmindapplication.service.ILeadService;
import com.mindtree.campusmindapplication.service.serviceImpl.CampusmindServiceImpl;
import com.mindtree.campusmindapplication.service.serviceImpl.LeadServiceImpl;
import com.mindtree.campusmindapplication.utility.DBConnection;
import com.mindtree.campusmindapplication.utility.EstablishConnection;

public class CampusmindDriver {

	static EstablishConnection connectionEst = new EstablishConnection();
	static Scanner scan = new Scanner(System.in);
	static ICampusmindService campusmindService = new CampusmindServiceImpl();
	static ILeadService leadService =new LeadServiceImpl();
	public static void main(String[] args) {
		boolean flag = true;
		do {
			int choice = displayMenu();
			switch (choice) {
			case 1:
				try {
					String msg = addCampusMindData();
					System.out.println(msg);
				} catch (OrchardAppException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 2: {
				List<CampusMind> cList;
				try {
					cList = campusmindService.getAllCampusMinds();
					display(cList);
				} catch (OrchardAppException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 3: {
				try {
					String msg = updateTrack();
					System.out.println(msg);
				} catch (OrchardAppException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 4: {
				try {
					String msg = delete();
					System.out.println(msg);
				} catch (OrchardAppException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 5: {
				try {
					addLeadData();
				} catch (OrchardAppException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 6: {
				try {
					getCampusMindDetailsGivenLeadName();
				} catch (OrchardAppException e) {
					System.out.println(e.getMessage());
				}
				
			}
			case 7: {
				try {
					DBConnection.closeConnection();
					System.out.println("\nConnection closed");
					flag = false;
				} catch (OrchardAppException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			default:
				System.out.println("Please enter a valid input");
				break;
			}
		} while (flag);
	}

	private static void getCampusMindDetailsGivenLeadName() throws OrchardAppException {
		System.out.println("Enter lead Name:");
		String leadName=scan.nextLine();
		try {
			Map<String,CampusMind> map=campusmindService.getCampusmindGivenLead(leadName);
			for(Map.Entry<String, CampusMind> m: map.entrySet()) {
				System.out.println("Lead name :"+m.getKey());
				System.out.println(m.getValue().toString());
			}
			
		} catch (CampusmindServiceException e) {
			throw new OrchardAppException(e.getMessage(),e);
		}
	}

	private static void addLeadData() throws OrchardAppException {
		System.out.println("Enter lead ID:");
		int id=Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter lead name");
		String name=scan.nextLine();
		
		System.out.println("Enter CampusMind ID");
		int cID= Integer.parseInt(scan.nextLine());
		
		try {
			String msg=leadService.addLead(new Lead(id,name,cID));
			System.out.println(msg);
		} catch (LeadServiceException e) {
			throw new OrchardAppException(e.getMessage(),e);
		}
		
	}

	private static String delete() throws OrchardAppException {
		System.out.println("Enter campusMind ID");
		int id = Integer.parseInt(scan.nextLine());
		try {
			String msg = campusmindService.deleteCampusMind(id);
			return msg;
		} catch (CampusmindServiceException e) {
			throw new OrchardAppException(e.getMessage());
		}
	}

	private static String updateTrack() throws OrchardAppException {
		System.out.println("Enter campusMind ID");
		int id = Integer.parseInt(scan.nextLine());
		System.out.println("Enter new Track");
		String newTrack = scan.nextLine();
		try {
			String msg = campusmindService.updateTrack(id, newTrack);
			return msg;
		} catch (CampusmindServiceException e) {
			throw new OrchardAppException(e.getMessage(), e);
		}
	}

	private static void display(List<CampusMind> cList) {
		for (CampusMind campusMind : cList) {
			System.out.println(campusMind.toString());
			System.out.println("----------------------------");
		}
	}

	private static String addCampusMindData() throws OrchardAppException {
		System.out.println("Enter campusmind ID");
		int id = Integer.parseInt(scan.nextLine());

		System.out.println("Enter campusmind Name");
		String name = scan.nextLine();

		System.out.println("Enter campusmind Age");
		int age = Integer.parseInt(scan.nextLine());

		System.out.println("Enter campusmind State");
		String state = scan.nextLine();

		System.out.println("Enter campusmind Track");
		String track = scan.nextLine();

		CampusMind campusMind = new CampusMind(id, name, age, state, track);

		try {
			String msg = campusmindService.addCampusmind(campusMind);
			return msg;
		} catch (CampusmindServiceException e) {
			throw new OrchardAppException(e.getMessage(), e);
		}
	}

	private static int displayMenu() {
		System.out.println("1. Add campusmind");
		System.out.println("2. Display campusminds");
		System.out.println("3. Update campusmind track");
		System.out.println("4. Delete campusmind data");
		System.out.println("5. Add Lead");
		System.out.println("6. Display campusMind given lead Name");
		System.out.println("7. Exit");
		System.out.println("Enter choice");
		int choice = Integer.parseInt(scan.nextLine());
		return choice;
	}

}

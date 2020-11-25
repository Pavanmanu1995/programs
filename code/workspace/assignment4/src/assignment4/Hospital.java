package assignment4;
import java.util.Scanner;
public class Hospital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the doctor array size");
		int size=sc.nextInt();
		Doctor[] doc=new Doctor[size];
		boolean flag=true;
		do{
			System.out.println("1.to insert doctor name");
			System.out.println("2.sort based on patient bill");
			System.out.println("3.display all doctor whose name start with 'a'");
			System.out.println("4.enter the patient name to display doctor name");
			System.out.println("5.exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			for(int i=0;i<size;i++) {
				System.out.println("enter the doctor id");
				int id=sc.nextInt();
				System.out.println("enter the doctor name");
				String name=sc.nextLine();
				System.out.println("enter the doctor salary");
				double salary=sc.nextDouble();
				System.out.println("enter the patient array size");
				int length=sc.nextInt();
				Patient[] patient=new Patient[length];
				for(int j=0;j<length;j++)
				{
					System.out.println("enter the patient id");
					int patientId=sc.nextInt();
					System.out.println("enter the patient name");
					String patientName=sc.nextLine();
					System.out.println("enter the patient bill");
					double bill=sc.nextDouble();
					patient[j]=new Patient(patientId,patientName,bill);
				}
				doc[i]=new Doctor(id,name,salary,patient);
				
			}

	}

}

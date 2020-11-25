package demopackage1;

import java.util.Scanner;

public class seatNumberQ10 {
	static boolean seat(String USN) {
		if (USN.length() == 10)
			if (USN.charAt(0) == '1' || USN.charAt(0) == '2')
				if ((USN.charAt(1) >= 'A' && USN.charAt(1) <= 'Z') && (USN.charAt(2) >= 'A' && USN.charAt(2) <= 'Z'))
					if ((USN.charAt(3) >= '0' && USN.charAt(3) <= '9')
							&& (USN.charAt(4) >= '0' && USN.charAt(4) <= '9'))
						if (((USN.charAt(5) >= 'A' && USN.charAt(5) <= 'Z') && (USN.charAt(5) == 'C'
								|| USN.charAt(5) == 'I' || USN.charAt(5) == 'E' || USN.charAt(5) == 'M')))

							if (((USN.charAt(6) >= 'A' && USN.charAt(6) <= 'Z') && (USN.charAt(6) == 'S'
							|| USN.charAt(6) == 'S' || USN.charAt(6) == 'C' || USN.charAt(6) == 'E')))


								if ((USN.charAt(7) >= '0' && USN.charAt(7) <= '9')
										&& (USN.charAt(8) >= '0' && USN.charAt(8) <= '9')
										&& (USN.charAt(9) >= '0' && USN.charAt(9) <= '9'))
									return true;
								else
									return false;
							else
								return false;
						else
							return false;
					else
						return false;
				else
					return false;
			else
				return false;
		else
			return false;

	}


	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the seat number");
		String USN = sc.nextLine();
		boolean flag = seat(USN);
		if (flag) {
			System.out.println("success");
		} else {
			System.out.println("faliure");
		}

	}
}

package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("===== CALENDAR =====");
		int month, day, year;
		int febDays = 28;
		int mDays = 30;
		int kDays = 31;
		int dDays = 1;
		int loop = 1;
		String monthWord = "";
		
		Scanner input = new Scanner(System.in);
		while (loop == 1) {
			System.out.println();
			System.out.print("Month : ");
			month = input.nextInt();
			
			System.out.print("Day   : ");
			day = input.nextInt();
			
			System.out.print("Year  : ");
			year = input.nextInt();
			
			System.out.println();
			
			switch (month) {
		 	case 1:
		 		monthWord = "January ";
		 		dDays = kDays;
		 		break;

			case 2:
				monthWord = "February ";
				if (year%4==0) {
						
					febDays++;
					if (year%100==0 && year%400!=0) {
							
						febDays--;
						
					}
					
				}
				dDays = febDays;
				break;

			case 3: 
				monthWord = "March ";
				dDays = kDays;
				break;

			case 4:
				monthWord = "April ";
				dDays = mDays;
				break;

			case 5:
				monthWord ="May ";
				dDays = kDays;
				break;

			case 6:
				monthWord = "June ";
				dDays = mDays;
				break;

			case 7:
				monthWord = "July ";
				dDays = kDays;
				break;

			case 8:
				monthWord = "August ";
				dDays = kDays;
				break;

			case 9:
				monthWord = "September ";
				dDays = mDays;
				break;

			case 10:
				System.out.print("October ");
				dDays = kDays;
				break;

			case 11:
				monthWord = "November ";
				dDays = mDays;
				break;

			case 12:
				monthWord = "December ";
				dDays = kDays;
				break;
			
			default:
				System.out.print("Invalid month. ");
				System.out.println();
			}
			
			if (year > 0) {
				
				if (month > 0) {
					
					if (month < 13) {
							
							if (day > dDays) {
								if (month == 2) {
									
									System.out.print("There are only " + febDays + " days in " + monthWord +"for this year. Please input a number which will not exceed " + febDays + ".");
									System.out.println();
									
								}else {
									
									System.out.print("There are only " + dDays + " days in " + monthWord +". Please input a number which will not exceed " + dDays + ".");
									System.out.println();
								}

							}else {
								
								System.out.print(monthWord + day + ", " + year);
								loop++;
								
							}
					}
						
				}
				
			} else {
			
			System.out.print("Invalid year. ");
			System.out.println();
			
			}
			
			if ( day <= 0) {
				
				System.out.print("Invalid date.");
				System.out.println();
				
			}
			
		}

	}

}

package javastatictask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportComplex {

	public static int choice;
	public static char ch;
	public String userName;
	public String name;
	
	public void sportList() {

		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("Cricket -- 5 slots", "Badminton -- 10 slots", "Football -- 20 slots"));
		
		System.out.println("Sports List are: \n" + list);
		System.out.println("Enter 1 -- For Cricket,  2 -- For Badminton,  3 -- For Football");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SportComplex sportComplex = new SportComplex();

		//do {

			try {

				sportComplex.sportList();
				int choice = sc.nextInt();
				switch (choice) {

				case 1:

					// code for Cricket
					Cricket c = new Cricket();
					c.cricketSlot();
					c.bookSlotForBadminton();
					c.maintaingCricketTimelots();

					break;

				case 2:

					// code for badminton
					Badminton b = new Badminton();
					b.badmintonSlot();
					b.bookSlotForBadminton();
					b.maintaingBadmintonTimelots();
					break;

				case 3:

					// code for football
					Football f = new Football();
					
					f.footballSlot();
					f.bookSlotForFootball();
					f.maintaingFootballTimelots();
					break;

				}

			} catch (Exception e) {

				System.out.println("Please Enter a valid choice !!! ");
				System.out.println("chhoice bte. 1 - 3, choice should be a Integer Number");
			}

//			System.out.println("\nWant To Enter New User Details , Press y or Exit From The Sport, Press n");
//			ch = sc.next().charAt(0);
//			if (ch == 'n') {
//
//				System.out.println("You are successfuly Exited From the SportComplex");
//
//			}
//
//		} while (ch == 'y');

	}

}

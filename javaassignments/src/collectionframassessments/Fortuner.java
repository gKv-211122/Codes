package collectionframassessments;

import java.util.HashMap;
import java.util.Scanner;

public class Fortuner {
	
	static char c;
	private static int quantity1 = 2;
	private static int quantity2 = 3;
	private static int quantity3 = 4;

	public static void fortuner() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> jaguar = new HashMap<String, Integer>();
		
		jaguar.put("Fortuner H", quantity1);
		jaguar.put("Fortuner I", quantity2);
		jaguar.put("Fortuner J", quantity3);
		do {
		System.out.println("Select car list from below which you want to buy :-");
		System.out.println("Click 1 to buy Fortuner H \t Available Quantity of this car is :  "+quantity1);
		System.out.println("Click 2 to buy Fortuner I \t Available Quantity of this car is : "+quantity2);
		System.out.println("Click 3 to buy Fortuner J \t Available Quantity of this car is :     "+quantity3);
		int Check = sc.nextInt();

		try {
			switch (Check) {
			case 1:
				System.out.println("You are going to buy  Fortuner H");
				quantity1 = quantity1 - 1;
				jaguar.replace("Fortuner H", quantity1);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + jaguar.get("Fortuner H"));
				break;
			case 2:
				System.out.println("You are going to buy Fortuner I");
				quantity2 = quantity2 - 1;
				jaguar.replace("Fortuner I", quantity2);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + jaguar.get("Fortuner I"));
				break;
			case 3:
				System.out.println("You are going to buy  Fortuner J");
				quantity3 = quantity3 - 1;
				jaguar.replace("Fortuner J", quantity3);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + jaguar.get("Fortuner J"));
				break;
				
			default:
				System.out.println("we dont have this model right now! we will let you know when we have ");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("IF YOU WANT TO BUY MORE THEN CLICK Y  or else click any key");
		c= sc.next().charAt(0);
		} while(c== 'Y');
	}

}

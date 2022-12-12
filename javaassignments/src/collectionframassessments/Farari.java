package collectionframassessments;

import java.util.HashMap;
import java.util.Scanner;

public class Farari {
	
	static char ch;
	private static int quantity1 = 20;
	private static int quantity2 = 23;
	private static int quantity3 = 34;

	public static void ferari() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> sedan = new HashMap<String, Integer>();
		
		sedan.put("Farari101", quantity1);
		sedan.put("Farari102 M", quantity2);
		sedan.put("Farari120", quantity3);
		do {
		System.out.println("Select car list from below which you want to buy :-");
		System.out.println("Click 1 to buy Farari101 \t Available Quantity of this car is :  "+quantity1);
		System.out.println("Click 2 to buy Farari102 M \t Available Quantity of this car is : "+quantity2);
		System.out.println("Click 3 to buy Farari120 \t Available Quantity of this car is :     "+quantity3);
		int Check = sc.nextInt();

		try {
			switch (Check) {
			case 1:
				System.out.println("You are going to buy  Farari101: ");
				quantity1 = quantity1 - 1;
				sedan.replace("Farari101", quantity1);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + sedan.get("Farari101"));
				break;
			case 2:
				System.out.println("You are going to buy  Farari102 M");
				quantity2 = quantity2 - 1;
				sedan.replace("Farari102 M", quantity2);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + sedan.get("Farari102 M"));
				break;
			case 3:
				System.out.println("You are going to buy  Farari120");
				quantity3 = quantity3 - 1;
				sedan.replace("Farari120", quantity3);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + sedan.get("Farari120"));
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
		ch= sc.next().charAt(0);
		} while(ch== 'Y');
	}

}

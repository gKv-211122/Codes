package collectionframassessments;

import java.util.HashMap;
import java.util.Scanner;

public class RangeRover {
	
	static char c;
	private static int quantity1 = 5;
	private static int quantity2 = 8;
	private static int quantity3 = 40;

	public static void rangeRover() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> audi = new HashMap<String, Integer>();
		
		audi.put("RangeRover A", quantity1);
		audi.put("RangeRover B", quantity2);
		audi.put("RangeRover C", quantity3);
		do {
		System.out.println("Select car list from below which you want to buy :-");
		System.out.println("Click 1 to buy RangeRover A \t Available Quantity of this car is :  "+quantity1);
		System.out.println("Click 2 to buy RangeRover B \t Available Quantity of this car is : "+quantity2);
		System.out.println("Click 3 to buy RangeRover C \t Available Quantity of this car is :     "+quantity3);
		int Check = sc.nextInt();

		try {
			switch (Check) {
			case 1:
				System.out.println("You are going to buy  RangeRover A");
				quantity1 = quantity1 - 1;
				audi.replace("RangeRover A", quantity1);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + audi.get("RangeRover A"));
				break;
			case 2:
				System.out.println("You are going to buy RangeRover B");
				quantity2 = quantity2 - 1;
				audi.replace("RangeRover B", quantity2);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + audi.get("RangeRover B"));
				break;
			case 3:
				System.out.println("You are going to buy  RangeRover C");
				quantity3 = quantity3 - 1;
				audi.replace("RangeRover C", quantity3);
				System.out.println("Congrats you have succcessfully bought  this car");
				System.out.println("Left Quantity of this car is :" + audi.get("RangeRover C"));
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

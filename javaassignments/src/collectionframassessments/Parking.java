package collectionframassessments;

import java.util.Scanner;

public class Parking {
	
	
	public String userName;
	public String vehicleId;
	//public String slot;
	public String slotChosenByUser;
	
	String [] slots1 = new String[15];
	String [] slots2 = new String[15];
	
	
	public void parkingSlot() {
		
		System.out.println("For Bike Parking(Bikes, BASMENT-1):  Total slots are: " + slots1.length);
		for(int i = 0; i < slots1.length; i++) {
	
			System.out.print("s-" + (i + 1) + " ");
	
		}
		System.out.println("\n\n");
	

	
		System.out.println("For Car Parking(Cars, BASMENT-2):  Total slots are: " + slots2.length);
		for(int i = 0; i < slots2.length; i++) {
	
			System.out.print("s-" + (i + 1) + " ");
	
		}
		System.out.println("\n\n");
	
		System.out.println("BASEMENT-1 -- For Bike Parking AND BASEMENT-2 -- For Car Parking In");
	}
	
	public void takeUserData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name || "
				+ "Enter vehicle Id || Enter which slot you want to book:");
		
		//  Enter Vehicle Type || \"Enter: b -- For Bikes, c -- For Cars\" ||
		
		this.userName = sc.next();
		
		this.vehicleId = sc.next();
		this.slotChosenByUser = sc.next();
		
		
		
	}

}

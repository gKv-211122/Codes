package collectionframassessments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Basement1 {
			
		public static char ch;
		
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<String> lst1 = new ArrayList<String>(Arrays.asList("s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8",
				"s9", "s10", "s11", "s12", "s13", "s14", "s15"));
		
	
			public void bikeSlots() {
			
				do {
					
					Parking p = new Parking();
				
					p.takeUserData();
				
					if(lst1.contains(p.slotChosenByUser)) {
				

						lst1.remove(p.slotChosenByUser);
						
						System.out.println("\nSlot Booked By(BIKES, BASEMENT-1): ");
						System.out.println((p.slotChosenByUser) + " : "  + "Bike Id - " + p.vehicleId);
						
						System.out.println("\nFor Bike Parking(BASMENT-1):  Avialable slots are: " + (lst1.size()));
						
						Iterator<String> iterate = lst1.iterator();
						while(iterate.hasNext()){
							System.out.print(iterate.next() + " ");
				     
						}
					}else {
				
						System.out.println("slot already booked, Please Choose Another Slot");
						System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " + (lst1.size()));
						
						Iterator<String> iterate = lst1.iterator();
						while(iterate.hasNext()){
							System.out.print(iterate.next() + " ");
				     
						}
					}
					
					
					System.out.println("\nEnter y, to continue and For Exit, Enter n");
					
					ch = sc.next().charAt(0);
					if(ch == 'n') {
						System.out.println("You are Successfully Exited");
						
						System.exit(0);
					}
					
		
				}while(ch == 'y');
			}
			
			
		
		
			


}



























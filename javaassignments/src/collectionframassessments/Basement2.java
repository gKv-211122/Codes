package collectionframassessments;

import java.util.ArrayList;
import java.util.Arrays;

public class Basement2 {
	
	ArrayList<String> lst1 = new ArrayList<String>(Arrays.asList("s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8",
			"s9", "s10", "s11", "s12", "s13", "s14", "s15"));
	
	
	public String vehicleId;
	public String slotChosenByUser;
	

	public void carSlots(String slotChosenByUser, String vehicleId) {
		
		this.slotChosenByUser = slotChosenByUser;
		this.vehicleId = vehicleId;
	
		System.out.println("\nOccupied slots By(CARS, BASEMENT-2): ");
		
		//slots[slotChosenByUser - 1] = "Occupied ! [" + vehicleId + "]";
		System.out.println("s-" + (slotChosenByUser) + " : "  + "Car Id - " + vehicleId);
		
		
		lst1.remove(slotChosenByUser);
		
		 
		System.out.println("For Car Parking(BASMENT-2):  Avialable slots are: " + (lst1.size()));
		
		for(int j = 0; j < lst1.size(); j++) {
			
			System.out.print(lst1.get(j)+ "  ");
			
		
		}
		
		lst1.remove(slotChosenByUser);
	
		
	}
	

}

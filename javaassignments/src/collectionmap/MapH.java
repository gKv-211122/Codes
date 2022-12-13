package collectionmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class MapH {
	
	ArrayList<String> lst1 = new ArrayList<String>(Arrays.asList("s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8",
			"s9", "s10", "s11", "s12", "s13", "s14", "s15"));
	
	HashMap<String, String> bookList = new HashMap<String, String>();
	
	
	public String vehicleId;
	public String slotChosenByUser;

	public void bikeSlots(String slotChosenByUser, String vehicleId) {
		
	
		this.slotChosenByUser = slotChosenByUser;
		this.vehicleId = vehicleId;
	
		System.out.println("\nOccupied slots By(BIKES, BASEMENT-1): ");
		System.out.println("s-" + (slotChosenByUser) + " : "  + "Bike Id - " + vehicleId);
		
		
		
		Iterator<String> itr = lst1.iterator(); 
		while (itr.hasNext()) {
			
			String loan = itr.next(); 
			
			if (loan.equals(slotChosenByUser)) { 
				itr.remove(); 
			} 
		}
		
		System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " + (lst1.size()));
		
		Iterator<String> iterate = lst1.iterator();
		while(iterate.hasNext()){
			
	      System.out.print(iterate.next() + " ");	     
	    }
		
	}
		 
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapH obj = new MapH();
		obj.bikeSlots("s3", "aaaa");
		obj.bikeSlots("s6", "aaaa");
		obj.bikeSlots("s5", "aaaa");
		obj.bikeSlots("s15", "aaaa");
		obj.bikeSlots("s1", "aaaa");
		obj.bikeSlots("s12", "aaaa");
		obj.bikeSlots("s9", "aaaa");

	}

}

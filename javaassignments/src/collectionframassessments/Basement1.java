package collectionframassessments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Basement1 {
			
		
		
		ArrayList<String> lst1 = new ArrayList<String>(Arrays.asList("s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8",
				"s9", "s10", "s11", "s12", "s13", "s14", "s15"));
		
		
		public String vehicleId;
		public String slotChosenByUser;
	
		public void bikeSlots(String slotChosenByUser, String vehicleId) {
			
			
			this.slotChosenByUser = slotChosenByUser;
			this.vehicleId = vehicleId;
		
			System.out.println("\nOccupied slots By(BIKES, BASEMENT-1): ");
			
			//slots[slotChosenByUser - 1] = "Occupied ! [" + vehicleId + "]";
			System.out.println("s-" + (slotChosenByUser) + " : "  + "Bike Id - " + vehicleId);
			
			
			lst1.remove(slotChosenByUser);
			
			 
			System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " + (lst1.size()));
			
			Iterator<String> iterate = lst1.iterator();
			 while(iterate.hasNext()){
			      System.out.print(iterate.next() + " ");
			     
			    }
			 
			 //lst1.remove(slotChosenByUser);
			
			}
			
		
		
		
		
		

		
		
		public void vechileDetails() {
			
			try {
				 
			      FileWriter myWriter = new FileWriter("parking.txt");
			      
			      myWriter.write("BASEMENT - 1");
			      myWriter.write("bikes and cars occupied solts");
			      
			      
			      myWriter.close();
			      
			    
			      System.out.println("Successfully wrote to the file.");
			      
			    } catch (IOException e) {
			    	
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			      
			    }
		}

}



























package collectionframassessments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basement1 {
			
		//String [] slots = {"s-1", "s-2", "s-3", "s-4", "s-5", "s-6", "s-7", "s-8","s-9", "s-10", "s-11", "s-12", "s-13", "s-14", "s-15"};
		
		List<String> lst1 = new ArrayList<String>(Arrays.asList("s-1", "s-2", "s-3", "s-4", "s-5", "s-6", "s-7", "s-8",
				"s-9", "s-10", "s-11", "s-12", "s-13", "s-14", "s-15"));
		
		public String vehicleId;
		public int slotChosenByUser;
	
		public void bikeSlots(int slotChosenByUser, String vehicleId) {
			
			
			this.slotChosenByUser = slotChosenByUser;
			this.vehicleId = vehicleId;
		
			System.out.println("\nOccupied slots By(BIKES, BASEMENT-1:) ");
			
			//slots[slotChosenByUser - 1] = "Occupied ! [" + vehicleId + "]";
			//System.out.println("s-" + (slotChosenByUser) + " : " + slots[slotChosenByUser - 1] + "Bike Id - " + vehicleId);
			System.out.println("s-" + (slotChosenByUser) + " : " + lst1.get(slotChosenByUser - 1) + "Bike Id - " + vehicleId);
			
			// remove occupied slot
//			List<String> list = new ArrayList<String>(Arrays.asList(slots));
//			list.remove(slotChosenByUser - 1);
//			
//			slots = list.toArray(new String[0]);
			lst1.remove(slotChosenByUser - 1);
			
			
			//int len = slots.length;
			int len = lst1.size();
			//String [] update = new String [len];
			//System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " + (len));
//			for(int i  = 0; i < update.length; i++) {
//				
//				
//				//System.out.print(+ "  ");
//				update[i] = slots[i];
//				
//			}
//			System.out.println();
//			
//			for(int j = 0; j < update.length; j++) {
//				
//				slots[j] = update[j];
//			}
			
			System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " + (len));
			
			for(int j = 0; j < len; j++) {
				
				System.out.print(lst1.get(j)+ "  ");
				
				//slots[j] = update[j];
			}
		
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



























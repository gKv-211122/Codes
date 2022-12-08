package collectionframassessments;

import java.io.FileWriter;
import java.io.IOException;

public class Basement1 {
	
		
		
		public int noOfBikes;
		public int noOfCars;
	
		public void bikes(int noOfBikes) {
			
			String [] slots = new String[15];
			
			this.noOfBikes = noOfBikes;
		
			System.out.println("For Bike Parking(BASMENT-1):  Total slots are: " + slots.length);
			for(int i = 0; i < slots.length; i++) {
			
				System.out.println("slot-" + (i + 1) + "   ");
			
			}
		
			System.out.println("\nOccupied slots By(BIKES, BASEMENT-1: ");
			for(int i = 0; i < noOfBikes; i++) {
			
				slots[i] = "Occupied !";
			
				System.out.println("slot-" + (i + 1) + " : " + slots[i] + "Bike - " + (i + 1));
			
			
			}
			int len = slots.length;
			System.out.println("For Bike Parking(BASMENT-1):  Avialable slots are: " + (len - noOfBikes));
			for(int i  = noOfBikes; i < slots.length; i++) {
				
				
				System.out.println("slot-" + (i + 1) + "   ");
				
			}
		
		
		}
		
		
		
		public void cars(int noOfcars) {
			
			
			String [] slots2 = new String[15];
			this.noOfCars = noOfCars;
			
			System.out.println("For Car Parking(BASMENT-1):  Total slots are: " + slots2.length);
			for(int i = 0; i < slots2.length; i++) {
			
				System.out.println("slot-" + (i + 1) + "   ");
			
			}
		
			System.out.println("\nOccupied slots By(CARS, BASEMENT-1): ");
			for(int i = 0; i < noOfCars; i++) {
			
				slots2[i] = "Occupied !";
			
				System.out.println("slot-" + (i + 1) + " : " + slots2[i] + "Cars - " + (i + 1));
			
			
			}
			
			int len = slots2.length;
			System.out.println("For Car Parking(BASMENT-1):  Avialable slots are: " + (len - noOfCars));
			for(int i  = noOfCars; i < slots2.length; i++) {
				
				
				System.out.println("slot-" + (i + 1) + "   ");
				
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



























package collectionframassessments;

public class Basement2 {
	
	String [] slots2 = new String[15];
	public int noOfCars;

	public void carSlots(int noOfcars) {
		
		this.noOfCars = noOfcars;
		
//		System.out.println("\n");
//		System.out.println("For Car Parking(BASMENT-2):  Total slots are: " + slots2.length);
//		for(int i = 0; i < slots2.length; i++) {
//		
//			System.out.print("s-" + (i + 1) + "   ");
//		
//		}
	
		System.out.println("\nOccupied slots By(CARS, BASEMENT-2): ");
		for(int i = 0; i < noOfCars; i++) {
		
			slots2[i] = "Occupied !";
			
			System.out.println("s-" + (i + 1) + " : " + slots2[i] + "Car - " + (i + 1));
		
		
		}
		
		int len = slots2.length;
		System.out.println("For Car Parking(BASMENT-2):  Avialable slots are: " + (len - noOfCars));
		for(int i  = noOfCars; i < slots2.length; i++) {
			
			
			System.out.print("s-" + (i + 1) + "  ");
			
		}
		System.out.println();
		
	}
	

}

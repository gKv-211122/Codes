package collectionframassessments;
import java.util.Scanner;



public class Ques15 {

	public static char ch;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		Parking obj = new Parking();
		obj.parkingSlot();
		
		char vehicleType;
		
			//do {
		
		//System.out.println("\n|| Want To Park The vehicle, Please Enter , \"y\" and Enter n, -- To EXit From The Parking ||");
		//
		System.out.println("Enter b, For BASEMENT-1, Enter c, For BASEMENT-2");
		vehicleType = sc.next().charAt(0);
		
			switch(vehicleType) {
		   
				case 'b':
					Basement1 bs1 = new Basement1();
				
					bs1.bikeSlots();
			
					break;
				
				case 'c':
					Basement2 bs2 = new Basement2();
				
					bs2.carSlots();
				
					break;
					
				case 0:
					
					break;
					
				
				default:
					System.out.println("Invalid Input, Please Enter Between 1 - 3, or For Exit Enter, 0");
		
			}
			
//			System.out.println("\n|| Want To Park The vehicle, Please Enter , \"y\" and Enter n, -- To EXit From The Parking ||");
//			ch = sc.next().charAt(0);
//			
//			if(ch == 'n') {
//				
//				System.out.println("You are successfully Exited From  Parking !!");
//				System.exit(0);
//				
//			}
//		
//		
//		}while(ch == 'y');
//		
//		
		
		
		
		
		
	}

}








































package collectionframassessments;
import java.util.Scanner;



public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * 
		 *  parking slots,
			1. there are two basements b1 and b2 both contains 30 slots
			2. b1 for bikes and b2 for cars
			3. allocate a vehicles with slots and generate a receipt and don't allocate a 
			single slot for two vehicles
			4. and store the data in a file			*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of vehicles: ");
		int num = sc.nextInt();
		
		System.out.println("No. of vehicles: " + num);
		
		System.out.println("Enter No. of BIKES and CARS");
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("No. of BIKES: " + b + "\n" + "No. of CARS: " + c);
		
		System.out.println("Enter 1, For -- BASEMENT-1, AND Enter 2, For -- BASEMENT-2");
		
		int a = sc.nextInt();
		
		switch(a) {
		   
			case 1:
				Basement1 bs1 = new Basement1();
			
				bs1.bikes(b);
				bs1.cars(c);
			
				break;
				
			case 2:
				
				Basement2 bs2 = new Basement2();
				bs2.bikes(b);
				bs2.cars(c);
				
				break;
				
			default:
				System.out.println("Invalid Input");
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}








































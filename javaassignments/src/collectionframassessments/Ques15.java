package collectionframassessments;
import java.util.Scanner;



public class Ques15 {

	public static char ch;
	public String userName;
	public char vehicleType;
	public String vehicleId;
	public int slot;
	
	
	public void takeUserData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name || Enter Vehicle Type || \"Enter: b -- For Bikes, c -- For Cars\" || Enter vehicle Id || Enter which slot you want to book:");
		
		this.userName = sc.next();
		this.vehicleType = sc.next().charAt(0);
		this.vehicleId = sc.next();
		this.slot = sc.nextInt();
		
		
	}
	
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
		Ques15 obj = new Ques15();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String [] slots1 = new String[15];
		String [] slots4 = new String[15];
		
		do {
		
			System.out.println("For Bike Parking(Bikes, BASMENT-1):  Total slots are: " + slots1.length);
			for(int i = 0; i < slots1.length; i++) {
		
				System.out.print("s-" + (i + 1) + " ");
		
			}
			System.out.println("\n\n");
		

		
			System.out.println("For Car Parking(Cars, BASMENT-2):  Total slots are: " + slots4.length);
			for(int i = 0; i < slots4.length; i++) {
		
				System.out.print("s-" + (i + 1) + " ");
		
			}
			System.out.println("\n\n");
		
			System.out.println("BASEMENT-1 -- For Bike Parking AND BASEMENT-2 -- For Car Parking In");
			
		
			obj.takeUserData();
		
			switch(obj.vehicleType) {
		   
				case 'b':
					Basement1 bs1 = new Basement1();
					
					bs1.bikeSlots(obj.slot, obj.vehicleId);
			
					break;
				
				case 'c':
					Basement2 bs2 = new Basement2();
					
					bs2.carSlots(obj.slot);
				
					break;
					
				case 0:
					
					break;
					
				
				default:
					System.out.println("Invalid Input, Please Enter Between 1 - 3, or For Exit Enter, 0");
		
			}
			
			System.out.println("\n|| Want To Park The vehicle, Please Enter , \"y\" and Enter n, -- To EXit From The Parking ||");
			ch = sc.next().charAt(0);
			
			if(ch == 'n') {
				
				System.out.println("You are successfully Exited From  Parking !!");
				System.exit(0);
				
			}
		
		
		}while(ch == 'y');
		
		
		
		
		
		
		
	}

}








































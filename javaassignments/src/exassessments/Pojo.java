package exassessments;

import java.util.Scanner;

class InvalidEmployeeId extends Exception {
	
	InvalidEmployeeId(String ex){
		super(ex);
	}
	
}


public class Pojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		String name = "ABC";
		int existingid = 1011;
		String address = "Telangana";
		
		
		System.out.println("Enter Employee id: ");
		int empid = sc.nextInt();
	
		try {
			if(empid != existingid) {
				
				throw new InvalidEmployeeId("give employee id is NOT found or missmatched");
			}
		
			else {
				System.out.println("Welcome to office");
			}
		
		}catch(InvalidEmployeeId e) {
			
			System.out.println(e);
		}

	}

}

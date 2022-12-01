package training;

public class FlowControl {

	public static void main(String[] args) {
    
		// java - FlowControl -- Flow Of Program, under a specific condition
		
		// 1. if , if-else, loops, switch case
		
		// pre and post order increment operator
		
		int num = 2;
		
		//
		
		++ num; // pre-increment operator
		System.out.println(num);
		
		num ++ ; // post-increment operator
		System.out.println(num);
		
		
		// loops -- for loop, while loop, do while loop
		for(int i = 0; i <= 5; i++) {
			
			System.out.print( i + " ");
		}
		
		System.out.println("while loop");
		
		int n = 1;
		
		while(n < 9) {
			
			if(n == 6) {
				
				n ++;
				continue;  // skip the value
				// break;  // terminate the loop
			}
			System.out.println(+ n + " ");
			
			n ++; // update the value 
		}
		
		System.out.println("do while loop");
		
		int n2 = 1;
		
		do {
			
			System.out.println(n2 + " ");
			
			n2 ++;
			
			
		}while(n2 > 5);
		
		System.out.println("if-else statement");
		
		int num1 = 1;
		
		if(num > 0) {
			
			System.out.println("Number is +ve");
		}
		else if(num1 == 0){
			
			System.out.println("Number is zero");
		}else {
			
			System.out.println("Number is -ve");
		}
		
		System.out.println("switch case");
		
		int date = 21;
		
		switch(date) {
		
			case 23:
				System.out.println("day after tommorow");
				break;
				
			case 22:
				System.out.println("Today");
				break;
			
			case 21:
				System.out.println("yesterday");
				break;
				
			default:
				System.out.println("day not Found !");
			
		}
		
		System.out.println("ternary operator");
		
		int a = 4;
		int b = 5;
		
		int min = (a < b) ? a : b;
		System.out.println("min values is: " + min);
		
	}

}

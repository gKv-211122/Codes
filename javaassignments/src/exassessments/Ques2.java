package exassessments;

import java.util.Scanner;

public class Ques2 {
	
	public static void vote(int age) {
		
			if(age < 18) {
			
			// custom exception
				throw new ArithmeticException("Not eligible to vote");
			
			}else {
			
			System.out.println("eligible to vote");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
	    int a = sc.nextInt();
		
		
		vote(a);
		
		
	}

}

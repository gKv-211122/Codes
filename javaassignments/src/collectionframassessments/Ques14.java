package collectionframassessments;

import java.util.Scanner;


class Mercedes {
	
	
}

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 
		 * 14.Car company stock maintenance & buying using collections
		 * 
		    a. Add a main car company --> it should have type of cars ---> 
		    Each type should have list of cars & quantity
			Ex: Mercedes --> SUV , Sedan , Compact SUV , crossover etc -->
			 SUV{GLC 330D , GLE 220D , GLD 450}, Hatchback(Glc 200, E class, c class), Coupe{530d}
			 
			b. one user can register and select a type of car and buy it , 
			on buying that specific count should be decreased & in console we 
			have to show the details & generate a txt file with all details.
			
			c.Initial data has to be read from Excel file                    */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter which car you want to buy from below list :");
		
		System.out.println(" Click 1 to check about Farari Series");
		
		System.out.println(" Click 2 to check about RangeRover Series");
		
		System.out.println(" Click 3 to check about Fortuner Series");
		
		int s = sc.nextInt();
		
		if(s==1) {
			Farari.ferari();
		}
		
		else if(s==2) {
			RangeRover.rangeRover();
			
		}
		
		else if(s==3) {
			
			Fortuner.fortuner();
		}
		else {
			throw new InvalidChoiceException();
		}

	}

}

package filehandlingassignment;

import java.io.File;
import java.io.IOException;

public class Qyes5WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		      File myObj = new File("EmployeeInfo.csv");
		      
		      if (myObj.createNewFile()) {
		    	  
		    	  	
		        System.out.println("File created: " + myObj.getName());
		        
		      } else {
		    	  
		        System.out.println("File already exists.");
		        
		      }
		    } catch (IOException e) { 
		    	
		      System.out.println("An error occurred.");
		      
		      e.printStackTrace(); 
		      
		    }
		
		
		
		  //Instantiating the CSVWriter class
	     
		
		    

	}

}

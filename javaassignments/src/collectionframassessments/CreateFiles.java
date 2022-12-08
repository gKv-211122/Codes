package collectionframassessments;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
	
	public void CreatedFile() {
	
		try {
		
			File myObj = new File("parking.txt");
	      
			if (myObj.createNewFile()) {
	    	  
	    	  	System.out.println("File created: " + myObj.getName());
			} 
	    } catch (IOException e) { 
	    	
	    		System.out.println("An error occurred.");
	            e.printStackTrace();
	     }
		
	}
	
}



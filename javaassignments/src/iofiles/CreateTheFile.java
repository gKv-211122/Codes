package iofiles;

import java.io.File;
import java.io.IOException;

public class CreateTheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a file object for the current location
		try {
			
		      File myObj = new File("filename.txt");
		      
		      if (myObj.createNewFile()) {
		    	  
		        System.out.println("File created: " + myObj.getName());
		        
		      } else {
		    	  
		        System.out.println("File already exists.");
		        
		      }
		    } catch (IOException e) {
		    	
		      System.out.println("An error occurred.");
		      
		      e.printStackTrace();
		    }

	}

}

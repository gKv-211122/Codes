package collectionframassessments;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
	
	public void WroteInFile(String data) {
		
		try {
			 
		      FileWriter myWriter = new FileWriter("parking.txt");
		      
		      myWriter.write("BASEMENT - 1");
		      myWriter.write(data);
		      
		      
		      myWriter.close();
		      
		    
		      System.out.println("Successfully wrote to the file.");
		      
		    } catch (IOException e) {
		    	
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      
		    }

	}

}

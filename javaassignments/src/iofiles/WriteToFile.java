package iofiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
			 
		      FileWriter myWriter = new FileWriter("filename.txt");
		      
		      myWriter.write("Files Operation in java");
		      myWriter.write("tihs is another line in file");
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		      
		    } catch (IOException e) {
		    	
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      
		    }

	}

}

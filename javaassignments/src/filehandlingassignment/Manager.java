package filehandlingassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Manager extends Employee {
	
	@Override
	public void createFile() {
		
		File myObj = new File("Employee.txt");

	}
	
	@Override
	public void writeFile() throws IOException {
		
		FileWriter myWriter = new FileWriter("Employee.txt");
	      
	    myWriter.write("Employee data is entered,");
	    myWriter.write("Name, id, post, location");
	      
	    myWriter.close();
	}
	
	@Override
	public void readFile() throws FileNotFoundException {
		
		 File myObj1 = new File("Employee.txt");
	     Scanner myReader = new Scanner(myObj1);
	      
	     while (myReader.hasNextLine()) {
	    	  
	    	 String data = myReader.nextLine();
	    	 System.out.println(data);
	        
	      }
	}
	
	public static void main(String [] args) throws IOException {
		
		
		Manager m = new Manager();
		
		m.createFile();
		m.writeFile();
		m.readFile();
		
	}

}

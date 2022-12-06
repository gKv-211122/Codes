package filehandlingassignment;

import java.io.File;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 
		 * 1. Employee has methods for create, read and write to a file. 
		 * Manager extends employer and have 
		 * these file methods overriden(Examine here without handling the exceptions) 
		 * along with delete the file       */
		
		try  
		{         
		File f= new File("Employee.txt");           //file to be delete  
		if(f.delete())                              //returns Boolean value  
		{  
		System.out.println(f.getName() + " deleted");   //getting and printing the file name  
		}  
		else  
		{  
		System.out.println("failed");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		
		


	}

}

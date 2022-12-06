package iofiles;

import java.io.File;

public class MakeNoneEditable extends ReadToFile {
	
	public static void main(String [] args) {
		
		 File myObj = new File("filename.txt");
		boolean flag = myObj.setReadOnly();	
		
		if (flag==true)
		{
		   System.out.println("File successfully converted to Read only mode!!");
		}
		else
		{
		   System.out.println("Unsuccessful Operation!!");
		}
		
	}
	
	

}

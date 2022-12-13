package collectionmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> bookList = new HashMap<String, String>();
		
		bookList.put("Book1", "A");
		bookList.put("Book2", "A");
		bookList.put("Book3", "A");
		bookList.put("Book4", "A");
		

		Iterator<Entry<String, String>> iterate = bookList.entrySet().iterator();
		
		System.out.println("Before Changing The Author Name");
		while (iterate.hasNext()) {
			
			System.out.print(iterate.next() + "  ");
		    
		      
		} 
		
		
		// Change The Author Name
		Iterator<String> iterate2 = bookList.keySet().iterator();
		while(iterate2.hasNext()) {
		      if(bookList.containsValue("A")) {
		    	  
		    	  bookList.replace(iterate2.next(), "changeAuthor");
		    	 
		      }
		      
		}
		
		Iterator<Entry<String, String>> iterate3 = bookList.entrySet().iterator();
		
		System.out.println("\nAfter Changing The Author Name");
		while (iterate3.hasNext()) {
			
			System.out.print(iterate3.next() + "  ");
		    
		      
		} 
		
		
		
	}
		
		
		

}


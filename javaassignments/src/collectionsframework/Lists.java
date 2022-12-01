package collectionsframework;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> lst = new LinkedList();
		
		 // Add elements to the list
		lst.add(1);
		lst.add(34);
		lst.add(2);
		lst.add(101);
		
		System.out.println("List: " + lst);
		
		// Access element from the list
        int number = lst.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = lst.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = lst.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        
        
        // print lst after remove the lst
        System.out.println(lst);
        
        
        // multiple data-type elements
        List ls = new LinkedList();
        
        ls.add("naem");
        ls.add(222);
        
        ls.add('c');
        ls.add(23.667);
        
        System.out.println("multiple data-type elements are: " + ls);
        
        
        // ArrayList
        
        ArrayList <String> str = new ArrayList();
        
        str.add("ABC");
        str.add("aaa");
        str.add("ccc");
        
        str.set(1, "home");
        
        System.out.println(str);
        
        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String data : str) {
          System.out.print(data);
          System.out.print(", ");
        }
		 
		 
		

	}

}

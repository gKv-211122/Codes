package objectmethods;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object class
		Object obj1 = new Object();
		System.out.println("class of obj1: " + obj1.getClass());
		System.out.println("class of obj1: " + obj1.toString());
		
		// array list class
		ArrayList <String> obj2 = new ArrayList();
		
		obj2.add("Java");
		System.out.println("class of obj2: " + obj2.getClass());
		
		// identify the location of objects in the hash table.
		// hashCode() method returns the hash code value associated with the object.
		System.out.println("hashCode of obj2: " + obj2.hashCode());
		
		
		// Object of Demo class
		Demo d = new Demo();
		System.out.println("class of obj1: " + d.getClass());
		
		
		// hashCode() with String
	    String str = new String();
	    System.out.println("hachCode of string class object: " + str.hashCode());  
	    
	    
	    // equal(), 
	    Object ob1 = new Object();

	    // assign obj1 to obj2
	    Object ob2 = ob1;

	    // check if two objects are equal
	    System.out.println(ob1.equals(ob2));  

	    // get hashcode of obj1 and obj2
	    System.out.println(ob1.hashCode());   
	    System.out.println(ob2.hashCode());   
	    
	    
	    
	    //  toString() method converts the object into a string and returns it.
	    System.out.println(obj1.toString());
	    
	    System.out.println(obj2.toString());
	    System.out.println(d.toString());
	    
		
		
		

	}

}

package collectionsframework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> map =new Hashtable<Integer,String>();  
		  
		  map.put(100,"Amit");  
		  map.put(102,"Ravi");  
		  map.put(101,"Vijay");  
		  map.put(103,"Rahul");  
		  
		  for(Map.Entry m: map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		   
		  }
		  
		    //Inserts, as the specified pair is unique  
		     map.putIfAbsent(104,"Gaurav");  
		     
		     System.out.println("Updated Map: "+map);  
		     
		     //Returns the current value, as the specified pair already exist  
		     map.putIfAbsent(101,"Vijay");  
		     
		     System.out.println("Updated Map: "+map);  

	}

}

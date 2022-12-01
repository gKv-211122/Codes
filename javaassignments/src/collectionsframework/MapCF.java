package collectionsframework;

import java.util.HashMap;

public class MapCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map implementation using HashMap
		// Map<Key, Value> numbers = new HashMap<>();
		
		
		// Creating a map using the HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        
        System.out.println("Initial HashMap: " + numbers);

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 32);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
        
        
        System.out.println("Map: " + numbers);
        
        // change element 
        numbers.replace("one", 333);
        System.out.println("HashMap using replace(): " + numbers);
        
        System.out.println("Map: " + numbers);
        
        
        
        
       
	}

}

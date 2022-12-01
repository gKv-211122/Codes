package collectionsframework;

import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Creating TreeMap of 
        TreeMap<String, Integer> numbers = new TreeMap<>();

        // Using put()
        numbers.put("Two", 2);
        numbers.put("Four", 4);

        // Using putIfAbsent()
        numbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + numbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> othernumbers = new TreeMap<>();
        othernumbers.put("One", 1);

        // Using putAll()
        numbers.putAll(othernumbers);
        System.out.println("TreeMap of numbers: " + numbers);
        
        
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
        
        
        System.out.println("Original TreeMap: " + numbers);
        
        // Using replace()
        numbers.replace("One", 22);
        numbers.replace("Third", 3, 33);
        System.out.println("TreeMap using replace: " + numbers);

        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("TreeMap using replaceAll: " + numbers);

        
        
        
        

	}

}

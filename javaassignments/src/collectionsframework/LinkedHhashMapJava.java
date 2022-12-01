package collectionsframework;

import java.util.LinkedHashMap;

public class LinkedHhashMapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a LinkedHashMap
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap2: " + numbers);
        
        // Using putIfAbsent()
        numbers.putIfAbsent("Six", 6);
        System.out.println("Updated LinkedHashMap(): " + numbers);
        
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
        
        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);
        
        
        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated LinkedHashMap: " + numbers);
        
        System.out.println("Updated LinkedHashMap: " + numbers.entrySet());


	}

}

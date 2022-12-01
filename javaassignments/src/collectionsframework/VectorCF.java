package collectionsframework;

import java.util.*;

public class VectorCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// syntax:  Vector<Type> vector = new Vector<>();
		
		Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        
        
        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);
        
        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        
        System.out.print("Vector: ");
        
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        
        // Using remove()
        System.out.println(animals.remove(1));
        
        System.out.println(animals);
        
        
        // Using clear()
        // animals.clear();
        // System.out.println("Vector after clear(): " + animals);
        
        System.out.println("element present or not: " + animals.contains("Horse"));

	}

}

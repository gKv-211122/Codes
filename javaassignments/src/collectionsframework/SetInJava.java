package collectionsframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashSet<Integer> set1 = new HashSet<>();

        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        System.out.println("Set1: " + set1);

        
        Set<Integer> set2 = new HashSet<>();

        
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set1.add(6);
        System.out.println("Set2: " + set2);

        
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
        
     // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = set2.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
            
        }
        
        System.out.println();
        
        HashSet <Integer> set3 = new HashSet();
        
        set3.add(2);
        set3.add(1);
        set3.add(6);
        
        System.out.println("Set3: " + set3);
        
        set2.retainAll(set3);
        
        System.out.println("Intersection is: " + set2);
        
        
        boolean result = set2.containsAll(set3);
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);

	}

}

package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		
		// Creating an arrayList of even numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> lnumbers = new LinkedHashSet<>(numbers);
        System.out.println("LinkedHashSet: " + lnumbers);

	}

}

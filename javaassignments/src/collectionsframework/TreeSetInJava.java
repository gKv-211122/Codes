package collectionsframework;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		// Using the add() method
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        TreeSet<Integer> onumbers = new TreeSet<>();
        onumbers.add(1);

        // Using the addAll() method
        numbers.addAll(onumbers);
        System.out.println("New TreeSet: " + numbers);
        
        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
        
        
        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);

	}

}

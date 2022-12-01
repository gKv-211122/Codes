package collectionmap;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList
		ArrayList a = new ArrayList();
		
		a.add("A");
		a.add(23);
		a.add('b');
		a.add(23.4);
		a.add(2, "Vinod");
		
		
		System.out.println(a);
		
		a.add("Kimu");
		
		System.out.println(a);
		
		a.remove(2);
		
		System.out.println(a);
		
		
		// linked list
		LinkedList list = new LinkedList();
		
		list.add("Ashok");
		list.add(30);
		list.add(null);
		list.add("Ashok");
		
		System.out.println(list);
		list.set(0, "Software");
		
		System.out.println(list);
		
		list.set(0, "Vinod");
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.addFirst("Dillesh");
		System.out.println(list);
		

	}

}

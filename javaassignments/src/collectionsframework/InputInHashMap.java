package collectionsframework;

import java.util.HashMap;
import java.util.Scanner;

public class InputInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		HashMap <String, Integer> info = new HashMap<>(); 
		
		
		System.out.println("Enter key and value: ");
		// System.out.println("Enter key and value , with space separeted");
		for(int i = 0; i < 3; i++) {
			
			System.out.print("Ente key: ");
			String k = sc.next();
			
			System.out.print("Ente value: ");
			Integer v = sc.nextInt();
			
			System.out.println();
			
			info.put(k, v);
			
			
		}
		System.out.println(info);

	}

}

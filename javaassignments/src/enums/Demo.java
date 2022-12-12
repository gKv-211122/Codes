package enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List<String> lst = new ArrayList<String>(Arrays.asList());
		
		String [] lst = {"s1", "s2", "s3", "s4", "s4", "s5"};
		
		for(int i = 0; i < lst.length; i++) {
			
			System.out.print(lst[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < lst.length; i++) {
			
			// System.out.print(lst[i] + " ");
			lst[i] = "abc";
		}
		System.out.println();
		
		for(int i = 0; i < lst.length; i++) {
			
			System.out.print(lst[i] + " ");
		}
		System.out.println();
		
		lst[5] = "change";
		lst[3] = "aaa";
		
		for(int i = 0; i < lst.length; i++) {
			
			lst[i] = "ok";
		}
		
		for(int i = 0; i < lst.length; i++) {
			
			System.out.print(lst[i] + " ");
		}
		System.out.println();

		List<String> lst1 = new ArrayList<String>(Arrays.asList("s1", "s2", "s3", "s4", "s4", "s5"));
		
		System.out.println(lst1);
		
		lst1.remove(2);
		
		System.out.println(lst1);

	}

}

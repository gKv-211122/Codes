package generics;

import java.util.*;


public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();  
		list.add("hello");    
		
		String s = (String) list.get(0);//typecasting   
		
		// After Generics, we don't need to typecast the object.  
		
		List<String> lst = new ArrayList<String>();    
		lst.add("hello");    
		String str = lst.get(0);  
		
		System.out.println(str);


	}

}

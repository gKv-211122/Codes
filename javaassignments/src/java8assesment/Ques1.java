package java8assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> lst = new ArrayList<String>();

	     lst.add("Java8 Features");
	     lst.add("Stream API");
	     lst.add("java API");
	     
	     // Stream<String> strm = lst.stream();
	     
	     
	     // anyMatch()
	    //  boolean anyMatch = strm.anyMatch((value) -> { return value.startsWith("Java8"); });
	    // System.out.println(anyMatch);
	     
	     // allMatch()
	     //boolean alMatch = strm.allMatch((value) -> { return value.contains("API"); });
	     //System.out.println(alMatch);
	     
	     
	     // noneMatch
	     
//	     boolean noneMatch = strm.noneMatch((element) -> {
//	            return "match".equals(element);
//	        });
//
//	        System.out.println("noneMatch = " + noneMatch);
	     
	        // collect()
	     
	     	List <String> lst2 = new ArrayList();
	     	lst2.add("one");
	        lst2.add("two");
	        lst2.add("three");
	        lst2.add("four");
	        lst2.add("five");
	        
	        Stream<String> stm = lst2.stream();
	        
	        List<String> stringsAsUppercaseList = stm
	                .map(value -> value.toUpperCase())
	                .collect(Collectors.toList());

	        System.out.println(stringsAsUppercaseList);
	        
	        // reduce()
	        
	        Optional<String> reduced = stm.reduce((value, combinedValue) -> {
	            return combinedValue + " + " + value;
	        });

	        System.out.println(reduced.get());

	}

}

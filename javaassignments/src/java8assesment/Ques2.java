package java8assesment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5", "1", "5", "3");
        
		
		// map
        List<Integer> listOfIntegers = listOfStrings.stream()
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());
         
        System.out.println(listOfIntegers);
        
        
        
        // flatMap()
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        
        List<Integer> numbers = Stream.of(evens, odds, primes)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        
        
        System.out.println("flattend list: " + numbers);
        
        
        
        
        // distinct()
        Stream<String> stream = listOfStrings.stream();
        
        List<String> distinctStrings = stream
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
        
        
        // limit()
        
        Stream<String> stream2 = listOfStrings.stream();
        
        stream2.limit(2)
        .forEach( element -> { System.out.println(element); });
        
        
        
        // peek()
        Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());
        
        
        
        // skip()
        
        System.out.println("Collection without skipping elements: ");
        listOfStrings.stream().forEach(System.out::println);
        
        System.out.println("Collection after skipping 4 elements: ");
        listOfStrings.stream().skip(4).forEach(System.out::println);

	}

}

package java8assesment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// LocalDate class, methods
		LocalDate date = LocalDate.now();    
		
	    LocalDate yesterday = date.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    
	    System.out.println("Today date: "+date);    
	    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow);
	    
	    
	    // LocalTime class, methods
	    LocalTime time = LocalTime.now();  
	    System.out.println(time); 
	    
	    
	    // LocalDateTime
	    LocalDateTime now = LocalDateTime.now();  
	    
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  

	}

}

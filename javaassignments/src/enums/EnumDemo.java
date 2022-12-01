package enums;

public class EnumDemo {
	
	public enum Season { 
		
		WINTER, SPRING, SUMMER, FALL 
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (Season s : Season.values()) {
			
			System.out.println(s);  
		}
		
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.values());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  

	}

}

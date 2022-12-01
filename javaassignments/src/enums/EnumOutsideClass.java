package enums;


// enum outside the class
enum Season { WINTER, SPRING, SUMMER, FALL; }  //  here ; is optional

public class EnumOutsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Season s=Season.WINTER;  
		System.out.println(s);  
		
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal()); 

	}

}

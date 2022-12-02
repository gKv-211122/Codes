package wrapperclass;

public class Prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creates objects of wrapper class
	    Integer obji = Integer.valueOf(23);
	    Double objd = Double.valueOf(5.55);

	    // converts into primitive types
	    int a = obji.intValue();
	    double b = objd;
	    System.out.println("The value of a: " + a);
	    System.out.println("The value of b: " + b);
	    
	    
	    
	    Integer myInt = 100;
	    
	    String myString = myInt.toString();
	    
	    System.out.println(myString.length());
	    
	}

}

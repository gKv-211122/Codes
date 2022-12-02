package wrapperclass;

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create primitive types
	    int a = 5;
	    double b = 5.65;

	    //converts into wrapper objects
	    Integer obji = Integer.valueOf(a);
	    Double objd = Double.valueOf(b);

	    if(obji instanceof Integer) {
	    	
	      System.out.println("converted into Integer.");
	    }

	    if(objd instanceof Double) {
	    	
	      System.out.println("converted into Double.");
	      
	    }
	    
	    System.out.println(obji.getClass());
	    System.out.println(objd.getClass());
	    
	  }

}



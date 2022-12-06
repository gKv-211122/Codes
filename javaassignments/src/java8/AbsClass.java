package java8;

abstract public class AbsClass {
	
	public AbsClass() {        // constructor    
        
		System.out.println("You can create constructor in abstract class");    
    }    
	
    abstract int add(int a, int b); // abstract method    
    
    int sub(int a, int b) {      // non-abstract method    
        
    	return a-b;    
    }    
    
    static int multiply(int a, int b) {  // static method    
        
    	return a*b;    
    }    

}



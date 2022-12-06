package java8;

public interface A {
	
	// Default method   
    default void say(){  
    	
        System.out.println("this is default method");  
    }  
    // Abstract method  
    
    void sayMore(String msg);  
    
    // static method
    static void sayLouder(String msg) {    
    	
        System.out.println(msg);    
    }    

}

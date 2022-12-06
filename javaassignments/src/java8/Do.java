package java8;

public interface Do {
	
	default void hello() {
		
		System.out.println("this is default method");
	}

}

@FunctionalInterface  
interface Done extends Do{  
	
    void say(String msg);   // abstract method  
    
}  

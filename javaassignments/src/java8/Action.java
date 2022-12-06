package java8;

@FunctionalInterface  
public interface Action {
	
	void say(String msg);
	
	// It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj); 

}

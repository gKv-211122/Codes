package java8;

public class DefaultM implements A {
	
	public void sayMore(String msg) {        // implementing abstract method   
       
		System.out.println(msg);  
    }  
	
	public static void main(String [] args) {
		
		DefaultM dm = new DefaultM();  
		
        dm.say();   // calling default method  
        dm.sayMore("implement abstract method");  // calling abstract method  
        
        A.sayLouder("static method , in interface");
	}

}

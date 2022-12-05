package java8;

public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Multiple parameters in lambda expression  
        Addition ad1 = (a, b) -> (a + b); {
        	
        	System.out.println("sum is: " + ad1.add(10, 20));  
        };  
        
          
        // Multiple parameters with data type in lambda expression  
        Addition ad2 = (int a, int b) -> (a + b);  
        System.out.println("sum is: " + ad2.add(100, 200));  
        
        
        
        
        // Lambda expression without return keyword.  
        Addition ad3 = (a, b) -> (a + b);  
        System.out.println(ad3.add(1044, 2044));  
          
        // Lambda expression with return keyword.    
        Addition ad4 = (int a, int b)->{  
        	
                 return (a + b);   
        };  
        
        System.out.println(ad4.add(100334, 20034));  

	}

}

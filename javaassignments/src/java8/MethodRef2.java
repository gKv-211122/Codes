package java8;

public class MethodRef2 {
	
	 public static void ThreadStatus() {  
		 
	        System.out.println("Thread is running...");  
	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//we are using predefined functional interface Runnable to refer static method.
		Thread t2=new Thread(MethodRef2::ThreadStatus);  
		
		
        t2.start();  

	}
}

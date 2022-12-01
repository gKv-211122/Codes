package exception;

public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		
		try {
			
			// code that may raise exceptionn
			int data = 100 / 0;
			
			int  len = str.length();
			
			System.out.println("result: " + data + " and " + len);
			
			System.out.println("rest of the code in try block");
		
		}catch(Exception e){
			
			System.out.println("Exception handle");
		}
		
		finally{
			
            System.out.println("Finally block is always executed");
        }
		
		System.out.println("Exceptional Handling in java");

	}

}

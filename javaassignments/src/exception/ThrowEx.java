package exception;

public class ThrowEx {
	
	public static void vote(int age) {
		
		if(age < 18) {
			
			// custom exception
			throw new ArithmeticException("Not eligible to vote");
			
		}else {
			
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// vote(23);
		vote(2);

	}

}

package exception;

public class ThrowsEx {
	
	public static void operation(int n, int m) throws ArithmeticException {
		
		int op = n / m;
		
		System.out.println("result is: " + op);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			operation(23, 0);
			
		}catch(Exception e) {
			
			System.out.println("Exception handle");
		}
		
		finally {
			
			System.out.println("finally block will always excuted");
		}

	}

}

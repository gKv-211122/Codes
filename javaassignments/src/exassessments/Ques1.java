package exassessments;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {2, 11, 24, 0, 23};
		
		try {
			
			int a = arr[4] /  0; 
			
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Occures");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBounds Exception occures");
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}

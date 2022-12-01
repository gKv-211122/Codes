package assessments;


// interface
interface Test {
	
	public int square(int s);
	
}

class Arithmetic implements Test {
	
	public int square(int side) {
		
		return (side * side);
	}
}


public class ToTestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test a = new Arithmetic();
		
		System.out.println("result is: " + a.square(5));

	}

}

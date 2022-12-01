package assessments;

public class DemoOverloading {
	
	
	
	// area of circle
	public static double areaCal(double ar) {
		
		return (3.14 * ar * ar);
		
	}
	
	// area of rectangle
	public static double areaCal(double l, double b) {
		
		return (l * b );
	}
	
	public static void main(String [] args) {
		
		
		System.out.println(areaCal(4.6));
		
		System.out.println(areaCal(4.0, 6.0));
		
	}

}

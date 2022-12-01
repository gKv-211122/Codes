package assessments;

class Box {
	
	public double length;
	public double breath;
	
	
	// consructor and set the value
	Box(double length, double breath){
		
		this.length = length;
		this.breath = breath;
		
		
	}
	
	public double area() {
		
		return (length * breath);
	}
	
	
}

class Box3d extends Box {
	
	public double height;
	
	// constructor and set the value
	
	Box3d(double l, double b, double h) {
		
		super(l, b);
		height = h;
	}
	
	public double volume() {
		
		return (super.area() * height);
	}
	
}
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Box3d obj = new Box3d(1, 2, 3);
		
		
		System.out.println("area is: " + obj.area());
		System.out.println("area is: " + obj.volume());
		
		
	}

}

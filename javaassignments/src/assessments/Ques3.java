package assessments;

class Shape {
	
	public double length;
	public double breath;
	public double height;
	public double radius;
	public double side; 
	
	
	
}
class Circle extends Shape {
	
	
	public double area() {
		
		return (3.14 * (radius * radius));
	}
	
	public double perimeter() {
		
		return (2 * 3.14 * radius);
	}
	
}
class Triangle extends Shape {
	
	public double area() {
		
		return (0.5 * (breath * height));
	}
	
	public double perimeter() {
		
		return (length * breath * height);
	}
	
	
}
class Square extends Shape {
	
	public double area() {
		
		return (side * side);
	}
	
    public double perimeter() {
		
		return (4 * side);
	}
	
}


public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

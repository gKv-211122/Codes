package assessments;

class Shape {
	
	public double length = 2.2;
	public double breath = 4.2;
	public double height = 3.3;
	public double radius = 2.2;
	public double side = 2.0; 
	
	public double area() {
		
		return 0;
	}
	
	public double perimeter() {
		
		return 0;
	}
	
	
	
}
class Circle extends Shape {
	
	
	public double area() {
		
		System.out.println("area of circle: ");
		return (3.14 * (radius * radius));
	}
	
	public double perimeter() {
		
		System.out.println("perimeter of Circle: ");
		return (2 * 3.14 * radius);
	}
	
}
class Triangle extends Shape {
	
	public double area() {
		
		System.out.println("area of Triangle: ");
		return (0.5 * (breath * height));
	}
	
	public double perimeter() {
		
		System.out.println("perimeter of Triangle: ");
		return (length * breath * height);
	}
	
	
}
class Square extends Shape {
	
	public double area() {
		
		System.out.println("area of square: ");
		return (side * side);
	}
	
    public double perimeter() {
		
    	System.out.println("perimeter of square: ");
		return (4 * side);
	}
	
}


public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj = new Circle();
		
		obj =  new Triangle();
		obj = new Square();
		
		System.out.println(obj.area());
		System.out.println(obj.perimeter());
		
		

	}

}

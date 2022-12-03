package anonymousclass;

// anonymous class
class Polygon {
	
	public void display() {
		
		System.out.println("Inside polygon class");
	}
	
}
	
	class CreateAnonymousClass {
		
		 public void createClass() {
		
			 Circle aObj  = new Circle() {   // an anonymous class
			
				 public void display() {
				
					 System.out.println("Inside Anonymous class");
				 }
			 };
			 aObj.display();
		
		 }
		 
}


public class AnonymousDemo {
	
	public static void main(String [] args) {
		
		CreateAnonymousClass o = new CreateAnonymousClass();
		
		o.createClass();
	}

}

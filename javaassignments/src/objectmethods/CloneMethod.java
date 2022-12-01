package objectmethods;

public class CloneMethod implements Cloneable{
	
	
	// fileds
	String name = "Python";
	int data = 1991;
		
	// methods
	public void display() {
			
		System.out.println("Python is a High-Level programming language");
	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		
		/**
		 * clone(), 
		 * clone() method creates a shallow copy of the object.

		Here, the shallow copy means it creates a new object and 
		copies all the fields and methods associated with the object.	*/
		
		CloneMethod obj1 = new CloneMethod();
		
		System.out.println("Access the fields and methods before the object colnning");
		
		System.out.println("language name: " + obj1.name + " and "+ " origin " + obj1.data);
		obj1.display();
		
		System.out.println("hasCode, obj1: " + obj1.hashCode());
		
		// -------------------------------------------------------------------------------
		
		// create another object , for clonning
		System.out.println("Accessing the fields and methodss after the colnning");
		
		CloneMethod obj2 = (CloneMethod) obj1.clone();
		
		System.out.println("language name: " + obj2.name + " and "+ " origin " + obj2.data);
		obj2.display();
		
		
		System.out.println("hasCode, obj1: " + obj2.hashCode());
		
		System.out.println("hasCode, obj1: " + obj2.hashCode());
		
		
		
//		try {
//			
//			CloneMethod obj2 = (CloneMethod) obj1.clone();
//			
//			System.out.println(obj2.name + " and " + obj2.data);
//			obj2.display();
//			
//			
//			System.out.println("hasCode, obj1: " + obj2.hashCode());
//		}catch(Exception e) {
//			
//			System.out.println(e);
//		}
		
		

	}

}

package training;

interface A{  // iterface 1
	
	public void greet();
}

interface B {  // interface 2
	
	public void wishing();
}

class C implements A, B{
	
	public void greet() {
		
		System.out.println("we acheive multtiple inheritance");
	}
	
	public void wishing() {
		
		System.out.println("by using implements keword");
	}
	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj = new C();
		
		obj.greet();
		obj.wishing();
		

	}

}

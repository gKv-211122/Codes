package training;

interface A1{
	
	void show();
}

interface B1 extends A1 {
	
	void print();
}

class C1 implements A1, B1 {
	
	public void show() {
		
		System.out.println("we acheive multtiple inheritance");
	}
	
	public void print() {
		
		System.out.println("by using extend and implements");
	}
}

public class MultipleInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		C1 obj = new C1();
		
		obj.show();
		obj.print();

	}

}

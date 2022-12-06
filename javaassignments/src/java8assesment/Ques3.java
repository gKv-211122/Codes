package java8assesment;
interface A {
	
	public void show();   // only one abstract metho -- functional Interface
	
	
}

interface B extends A {
	
	public void greet();
	
	
}
public class Ques3 implements A, B{
	
	@Override
	public void show() {
		
		System.out.println("Interface A, show()...");
	}
	
	@Override
	public void greet() {
		
		System.out.println("Interface B, gret()...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ques3 q = new Ques3();
		
		q.show();
		q.greet();

	}

}

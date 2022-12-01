package training;

abstract class Bike{ 
	
	  abstract void run();
	  
}  
class Honda4 extends Bike{ 
	
	void run(){
		
		System.out.println("running safely");
		
	}  
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj = new Honda4();  
		obj.run();  

	}

}

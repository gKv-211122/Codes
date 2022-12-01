package training;

class Animal{ 
	
	 public void eat( ){
		 
		 System.out.println("animal is eating...");
		 
	 }  
}  
	  
class Dog extends Animal { 
	
	 public void eat(){
		 
		 System.out.println("dog is eating...");
		 
	 }  
}
	  

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Animal a=new Dog();  
		 a.eat();  

	}

}

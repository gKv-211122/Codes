package training;

interface Drawable {  
	
   public void draw();  
   
}  
//Implementation: 
class Rectangle implements Drawable {  
	
	public void draw() {
		
		System.out.println("drawing rectangle");
		
	}  
}  

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Drawable d=new Rectangle();
		d.draw(); 

	}

}

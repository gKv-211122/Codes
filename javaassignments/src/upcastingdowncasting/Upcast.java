package upcastingdowncasting;

public class Upcast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Parent obj1 = (Parent) new Child();  
	      Parent obj2 = (Parent) new Child();   
	      
	      obj1.PrintData();  
	      obj2.PrintData();  

	}

}

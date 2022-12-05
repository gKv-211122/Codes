package java8;

public class MethodRef {
	
	//	 we have defined a functional interface and referring a 
	//	static method to it's functional method, addOn()
	
	public static void show() {
		
		System.out.println("Features all ready added");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Referring static method  
        Features fe = MethodRef::show; 
        
        // Calling interface method  
        fe.addOn();  

	}

}

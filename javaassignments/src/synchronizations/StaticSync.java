package synchronizations;

public class StaticSync {
	
	public static void main(String [] args) {
		
		MyThread6 t1 = new MyThread6();    
		MyThread7 t2 = new MyThread7();    
		MyThread8 t3 = new MyThread8();    
		MyThread9 t4 = new MyThread9();    
		
		t1.start();    
		t2.start();    
		t3.start();    
		t4.start();    
	}
}
	
	
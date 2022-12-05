package synchronizations;

public class SynchronizationBlock extends Thread {
	 
	
	
	public static void main(String [] args) {
		
		Table2 obj = new Table2();//only one object   
		
		MyThread3 t1 = new MyThread3(obj);    
		MyThread4 t2 = new MyThread4(obj);    
		
		t1.start();    
		t2.start();  
	}

}

package synchronizations;

public class Table2 {
	
	void printTable(int n) {    
		
		   synchronized(this){//synchronized block    
			   
		     for(int i=1;i<=5;i++) {    
		    	 
		    	 System.out.println(n*i);   
		    	 
		    	 try {   
		    	  
		    		 Thread.sleep(400);  
		       
		    	 }catch(Exception e) {
		    	  
		    		 System.out.println(e);
		    	  
		         }    
		     }    
		}    
		   
	}

}

class MyThread3 extends Thread {    
	
	Table2 t;    
	
	MyThread3(Table2 t) {   
		
		this.t = t;    
	}    
	
	public void run(){   
		
		t.printTable(5);    
	}    
	    
}    
class MyThread4 extends Thread {  
	
	Table2 t;   
	
	MyThread4(Table2 t) {   
		
		this.t=t;    
	}    
	public void run() {   
		
		t.printTable(100);    
	}    
}    

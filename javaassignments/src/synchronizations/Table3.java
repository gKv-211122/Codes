package synchronizations;

public class Table3 {
	
	synchronized static void printTable(int n) {    
		
		   for(int i=1;i<=10;i++) {     
			   
			   System.out.println(n*i);    
			   
		     try{ 
		    	 
		       Thread.sleep(400);  
		       
		     }catch(Exception e){
		    	 
		    	 System.out.println(e);
		     }    
		     
		   }    
	}  
	
}    
class MyThread6 extends Thread { 
			
		public void run() {    
				
			Table3.printTable(1);    
		}   
		
}    
class MyThread7 extends Thread {    
			
		public void run() {    
				
			Table3.printTable(10);    
		}    
		
}    
class MyThread8 extends Thread {    
			
		public void run() {    
			
			Table3.printTable(100);    
		}   
		
}    
class MyThread9 extends Thread {   
			
		public void run() {    
				
			Table3.printTable(1000);    
		}    
		

}



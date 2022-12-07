package multithreadingassessments;

public class Ques4 extends Thread {
	
	public void run() {
		
		for(int i = 0; i < 7; i++) {
			
			try {
				
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();

		Thread t3 = new Thread();
		
		
		//t1.setDaemon(true);   // It marks the thread as daemon or user thread.
	        
	        
	    // starting all the threads   
	    t2.start();   
	    t3.start();

	}

}

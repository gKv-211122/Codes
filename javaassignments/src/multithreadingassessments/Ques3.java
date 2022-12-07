package multithreadingassessments;

public class Ques3 extends Thread {
	
	public void run() {
		
		for(int i = 0; i < 7; i++) {
			
			try {
				
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				 
				System.out.println(e);
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
			
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread();
		t.start();
		
		

	}

}

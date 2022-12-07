package multithreadingassessments;

public class Ques1 extends Thread {
	
	public void run() {
		
		String [] str = {"java", "is", "hot", "and", "aromatic", "nvigorating"};
		
		for(int i = 0; i < str.length; i++) {
			
			try {
				
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				 
				System.out.println(e);
			}
			
			System.out.println(str[i]);
		}
		
		
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		Ques1 t1 = new Ques1();
		Ques1 t2 = new Ques1();
		
		t1.start();
		t2.start();

	}

}

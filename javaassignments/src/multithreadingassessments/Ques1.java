package multithreadingassessments;

public class Ques1 extends Thread {
	
	public void run() {
		
		System.out.println("java is hot");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques1 t1 = new Ques1();
		Ques1 t2 = new Ques1();
		
		t1.start();
		t2.start();

	}

}

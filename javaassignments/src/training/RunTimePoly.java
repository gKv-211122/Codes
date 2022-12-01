package training;

class Bank {
	
	public int data = 34;
	 
	public void statements() {
		
		System.out.println("bank statements are: month-wise, year-wise");
	}
}

class SBI extends Bank {
	
	public int data = 84;
	
	public void statements() {
		
		System.out.println("bank statements , SBI: sbi-month-wise, sbi-year-wise");
	}
}

public class RunTimePoly {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Runtime Polymorphism with single inheritance
		
		Bank b = new SBI();
		// here reference is of parent class and , object of child class
		
		b.statements();
		
		System.out.println("data member cannot be override: " + b.data);

	}

}

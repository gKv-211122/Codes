package java8;

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pixel = 254;
		
		// without lambda, Features implementation using anonymous class  
		Features obj = new Features() {
			
			public void addOn() {
				
				System.out.println("Features added: " + pixel + " MP");
			}
		};
		
		obj.addOn();

	}

}

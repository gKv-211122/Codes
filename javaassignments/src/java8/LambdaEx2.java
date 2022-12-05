package java8;

public class LambdaEx2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pixel = 354;
		
		// using Lambda Expression
		Features obj = () -> {
			
			System.out.println("Features added: " + pixel + " MP");
		};
		
		obj.addOn();

	}

}

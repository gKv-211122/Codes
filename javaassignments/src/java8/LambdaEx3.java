package java8;

public class LambdaEx3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lambda expression , one parameter
		Version ob = (name) -> {
					
			return "launched version: " + name;
		};
		
		System.out.println(ob.vName("v0.3.0"));
		
		
		// lambda expression no parameters
		Statement os = () -> {
			
			return "this is lambda expression";
		};
		
		System.out.println(os.greet());
		
		
		
		

	}

}

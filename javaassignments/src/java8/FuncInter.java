package java8;

public class FuncInter implements Action {
	
	public void say(String msg) {
		
		System.out.println(msg);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FuncInter fi = new FuncInter();
		fi.say("Functional Interface");

	}

}

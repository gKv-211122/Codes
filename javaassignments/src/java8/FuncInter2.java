package java8;

public class FuncInter2 implements Done {
	
	public void say(String msg) {
		
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncInter2 f2 = new FuncInter2();
		f2.say("Done");
		f2.hello();

	}

}

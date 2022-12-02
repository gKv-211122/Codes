package wrapperclass;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = Byte.parseByte("10");
		System.out.println(b); 
		
		short s = Short.parseShort("25");
		System.out.println(s); 
		
		int i = Integer.parseInt("123");
		System.out.println(i); 
		
		long l = Long.parseLong("100");
		System.out.println(l); 
		
		float f = Float.parseFloat("12.35");
		System.out.println(f); 
		
		double d = Double.parseDouble("12.87");
		System.out.println(d); 
		
		boolean bln = Boolean.parseBoolean("true");
		System.out.println(bln); 
		
		boolean bln1 = Boolean.parseBoolean("abc");
		System.out.println(bln1); 
		
		// char c = Character.parseChar("abc"); //compile time error
		//parseChar() is not defined for Character wrapper class
		
		
		//Character C = Character.valueOf("C"); 

	}

}

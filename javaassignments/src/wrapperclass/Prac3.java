package wrapperclass;

public class Prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte b = 10;  
		short s = 20;  
		int i = 30;  
		long l = 40;  
		float fl = 50.0f;  
		double d = 60.0;  
		char c = 'a';  
		boolean b2 = true;  
		
		
		// convert primitive --- object
		
		Byte byteobj = Byte.valueOf(b);  
		Short shortobj = s;  
		Integer intobj = i;  
		Long longobj = l;  
		Float floatobj = fl;  
		Double doubleobj = d;  
		Character charobj = c;  
		Boolean boolobj = b2;  
		
		
		// convert object --- primitive
		
		byte bytevalue = byteobj.byteValue();  
		short shortvalue = shortobj;  
		int intvalue = intobj;  
		long longvalue = longobj;  
		float floatvalue = floatobj;  
		double doublevalue = doubleobj;  
		char charvalue = charobj;  
		boolean boolvalue = boolobj; 
		
		

	}

}
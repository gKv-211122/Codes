package strings;

public class StrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    String first = "string";
	    String second = "in";
	    String third = "java";
	    
	    first.concat("change");  // umnutable
	    

	    // print strings
	    System.out.println(first);  
	    System.out.println(second);  
	    System.out.println(third);  
	    
	    System.out.println(first); // after concatenating
	    
	    String ltrl = "this is string using new keyword";
	    
	    String str = new String("this is string using new keyword");
	    
	    System.out.println(str.substring(0, 4));
	    
	    System.out.println(str.charAt(8));
	    
	    System.out.println(str.getBytes());
	    
	    System.out.println(str.indexOf('u'));
	    
	    
	    System.out.println(str.compareTo(ltrl));
	    
	    System.out.println(str.compareToIgnoreCase(ltrl));
	    
	    System.out.println(str.split(str));
	    
	    
	    System.out.println(first.toCharArray());
	    
	    System.out.println(first.hashCode());
	    
	    System.out.println(ltrl.subSequence(2, 9));
	    
	    
	    System.out.println(str.intern());
	    
	    
	    System.out.println(first.toUpperCase());
	    
	    System.out.println(first.trim());
	    
	    
	    System.out.print(str.contains("java"));

	}

}

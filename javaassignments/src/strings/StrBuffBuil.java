package strings;

public class StrBuffBuil {
	

    // Concatenates to String
    public static void concat1(String s1) {
    	
        s1 = s1 + "change";
        
       // System.out.println(s1);
    }
 
    
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {
    	
        s2.append("change");
    }
 
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {
    	
        s3.append("change");
    }
 
   
    public static void main(String[] args) {
        
        String s1 = "javaString";
        concat1(s1);

        System.out.println("String: " + s1);  // not change
 
      
        
        StringBuilder s2 = new StringBuilder("strbuil");
        concat2(s2);
 
        System.out.println("StringBuilder: " + s2);
 
    
        StringBuffer s3 = new StringBuffer("strbuff");
        concat3(s3);
 
        System.out.println("StringBuffer: " + s3);
    }


	

}

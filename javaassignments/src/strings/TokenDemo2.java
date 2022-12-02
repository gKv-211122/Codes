package strings;
// program on token
import java.util.StringTokenizer;

public class TokenDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        
        String mystr = "JAVA  Code  String  Tokenizer  Strtoken";
 
        // Use of Constructor 2
        // Here we are passing Delimiter - "mydelim"
        StringTokenizer st = new StringTokenizer(mystr);
 
        // Printing count of tokens and tokens
        // using countTokens() method
        int count = st.countTokens();
        System.out.println("Number of tokens : " + count + "\n");
 
        
        for (int i = 0; i < count; i++)
        	
            System.out.println("token at [" + i + "] : "
                               + st.nextToken());
 
        
//        while (st.hasMoreTokens()) {
// 
//            System.out.println(st.nextToken());
//            
//        }
        
        
        while (st.hasMoreElements())   // 
        	 
            //  Returning the next token
            // using nextElement() method
            System.out.println(st.nextElement());

	}

}

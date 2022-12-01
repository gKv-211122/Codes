package strings;

import java.util.StringTokenizer;

public class ToknizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StringTokenizer st = new StringTokenizer("tokenizer demo in java");  
		 
		 System.out.println("Next token is : " + st.countTokens());
		 
	     while (st.hasMoreTokens()) {  
	    	 
	         System.out.println(st.nextToken());  
	     }  
	     
	     
	     System.out.println("Next token is : " + st.hasMoreElements());  
	     
	   
	}

}

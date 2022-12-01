package strings;

public class StringBuffVsStrBuil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long startTime = System.currentTimeMillis();  
		
        StringBuffer sb = new StringBuffer("String"); 
        for (int i=0; i<10000; i++) {  
        	
            sb.append("Buffer");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        
        
        startTime = System.currentTimeMillis();  
        
        StringBuilder sb2 = new StringBuilder("String");  
        for (int i=0; i<10000; i++) {  
        	
            sb2.append("Builder");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  

	}

}

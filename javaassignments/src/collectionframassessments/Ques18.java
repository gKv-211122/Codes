package collectionframassessments;

import java.util.*;

public class Ques18 {
	
	
	/*public static void stringLowerUpper(ArrayList <String> str) {
		
		
		Collections.sort(str);  // sort alphabatically-order
		
		System.out.println("After sorting the element in alphabatically order: \n" + str);
		
		ArrayList <String> str1 = null;
		ArrayList <String> str2 = null;
		
		int div = str.size() % 2;
		
		if( div== 0) {
			
			 str1 = (ArrayList<String>) str.subList(0, str.size() / 2);
			 str2 = (ArrayList<String>) str.subList(str.size() / 2, str.size());
			
			
			for (String up : str1) {
				
	            String upValue = up.toUpperCase(Locale.ROOT);
	            str1.set(str1.indexOf(up), upValue);
	        }
			
			for (String lo : str2) {
				
	            String loValue = lo.toLowerCase(Locale.ROOT);
	            str2.set(str2.indexOf(lo), loValue);
	        }
		}
		
		System.out.println(str1 +" "+ str2);*/
		
		
		
	// }
	public static void sortAlpha(String [] s) {
		
		int n = s.length;
		
		//logic for sorting     
        for(int i = 0; i < n; i++)   //Holds each element
        {  
            for (int j = i + 1; j < n; j++)  //Check for remaining elements 
            {  
               //compares each elements of the array to all the remaining elements  
               if(s[i].compareTo(s[j]) > 0)   
               {  
                   //swapping array elements  
                   String temp = s[i];  
                   s[i] = s[j];  
                   s[j] = temp;  
                }  
             }  
          }
        
        int l = s.length;
        
        String [] s1 = new String[s.length / 2];
    	String [] s2 = new String[s.length / 2];
    	
    	int l2 = (s.length / 2) + 1;
    	
    	String [] s3 = new String[l2];
    	String [] s4 = new String[s.length / 2];
    	
        if(l % 2 == 0) {
        	
        	
        	for(int i = 0; i < s.length / 2; i++) {
			
        	
        		for(int j = 0; j < s1.length; j++) {
        		
        			s1[j] = s[i].toUpperCase();
        		}
        	
        	
			}
        	
        	for(int k = s.length / 2; k < l; k++) {
        		
        		for(int m = 0; m < s1.length; m++) {
            		
        			s2[m] = s[k].toLowerCase();
        		}
        		
        	}
        	
        }else {
        	
        		for(int i = 0; i < l2; i++) {
        		
        			for(int j = 0; j < s3.length; j++) {
                		
            			s3[j] = s[i].toUpperCase();
            		}
        		
        		}
        		
        		for(int k = s.length / 2; k < l; k++) {
            		
            		for(int m = 0; m < s4.length; m++) {
                		
            			s4[m] = s[k].toLowerCase();
            		}
            		
            	}
        		
        		for(int c = 0; c < s3.length; c++) {
        			
        			System.out.print(s3[c] + " ");
        			
        		}
        	
        	
        }
        
        
	}
	
	public static void upperLower(String [] st) {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 
		 * 	Create a method that can accept an array of String objects and sort in alphabetical order.
		 * 
			The elements in the left half should be completely in uppercase and the elements
			in the right half should be completely in lower case.
			
			Return the resulting array.
			
			Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE
		 	*/
		
		// ArrayList <String> strs = new ArrayList();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of string");
		int n = sc.nextInt();
		
		String [] str = new String[n];
		
		System.out.println("Enter string: ");
		for(int i = 0; i < n; i++) {
			
			str[i] = sc.next();
			
			
		}
		
		
		
		sortAlpha(str);
		
		
		
		
		
		
	}

}

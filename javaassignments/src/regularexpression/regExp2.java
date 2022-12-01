package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("regularExpression", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("java ReGulareXpression");
	    
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	    	
	      System.out.println("Match found");
	      
	    } else {
	    	
	      System.out.println("Match not found");
	    }

	}

}

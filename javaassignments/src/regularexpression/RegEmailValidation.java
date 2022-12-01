package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEmailValidation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pattern p = Pattern.compile("[a-zA-Z0-9._]@[a-zA-Z0-9]([.][a-zA-Z]+)*");
		Matcher m = p.matcher(args[0]);
		
		while (m.find()) {
			
	
			if (m.group().equals(args[0])) {
				System.out.println("Valid Email ID");
				
			} else {
			
		
			System.out.println("Invalid Email ID");
			}

		}
		
	}

}

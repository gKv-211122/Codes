package regularexpression;

import java.util.regex.*;

public class RegExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
        Pattern pattern = Pattern.compile("regex");
 

        Matcher m = pattern.matcher("regex in java");
 

        while (m.find())

            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
	}

}

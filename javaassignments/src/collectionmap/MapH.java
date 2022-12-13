package collectionmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> test = 
			    new HashMap<String, String>(){{
			    	put("s1", "bikeParking");
			    	put("s2", "bikeParking");
			    	put("s3", "bikeParking");
			    	put("s4", "bikeParking");
			    	put("s5", "bikeParking");
			    	put("s6", "bikeParking");
			    	put("s7", "bikeParking");
			    	put("s8", "bikeParking");
			    	put("s9", "bikeParking");
			    	put("s10", "bikeParking");
			    	put("s11", "bikeParking");
			    	put("s12", "bikeParking");
			    	put("s13", "bikeParking");
			    	put("s14", "bikeParking");
			    	put("s15", "bikeParking");
			    
			    	
			    	
			    }};
			    
			    
			  test.forEach((key,value) -> System.out.print(key + " = " + value));
			  test.remove("s4");
			  
			  
			  
			  
			  
			  Iterator<Entry<String, String>> it = test.entrySet().iterator();
			  while (it.hasNext()) {
					Map.Entry<String, String> set = (Map.Entry<String, String>) it.next();
					System.out.println(set.getKey() + " = " + set.getValue());
				}

	}

}

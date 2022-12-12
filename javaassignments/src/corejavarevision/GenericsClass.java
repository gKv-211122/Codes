package corejavarevision;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
	
	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("5"); 

		for(Object obj : list){
			//type casting leading to ClassCastException at runtime
		    //String str=(String) obj; 
			System.out.println(obj);
		}
		
		
		GenericsClass type = new GenericsClass();
		type.set("Pankaj"); 
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException

	}

}

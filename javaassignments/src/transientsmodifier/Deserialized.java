package transientsmodifier;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class Deserialized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {  
			
			  //Creating stream to read the object  
			  ObjectInputStream in = new ObjectInputStream(new FileInputStream("studentdata.txt"));  
			  
			  Student s=(Student)in.readObject();  
			  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name +" "+ s.age);  
			  
			  //closing the stream  
			  in.close();  
			  
			  }catch(Exception e) {
				  
				  System.out.println(e);
				  
			  }     

	}

}

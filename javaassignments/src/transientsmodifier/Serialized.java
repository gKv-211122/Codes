package transientsmodifier;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialized {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Student s1 =new Student(211,"ravi",22);//creating object    
		
		//writing object into file    
		FileOutputStream f=new FileOutputStream("studentdata.txt");   
		
		ObjectOutputStream out=new ObjectOutputStream(f);   
		
		out.writeObject(s1);    
		out.flush();    
		out.close();    
		f.close();    
		
		System.out.println("serialized success !");  

	}

}

package serialization;

import java.io.Serializable;

class Student implements Serializable {

	int id;  
	String name;
	int age;
	
	 public Student(int id, String name, int age) {  
		 
		 this.id = id;  
		 this.name = name;  
		 this.age = age;
		 
	 }  

}

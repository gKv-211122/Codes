package training;

class Student {
	
	int id;
	String name;
	static String college = "IIT";
	
	Student(){
		
		System.out.println("parent class constructor, \"Student()\"");
	}
	
	// constructor, with parameter
	Student(int id, String name){
		
		this.id = id;  // initialize class variable
		this.name = name;
	}
	
	// method
	public void info() {
		
		System.out.println("student data: \n" + "id: " + id + " , "+"Name: " + name + " , " +"college: "+ college);
	}
}
class Btech extends Student {
	
	String branch = "CSE";
	
	Btech(){
		
		super();  // call the parent class constructor
		System.out.println("child class concturctor, \"btech()\"");
		
		
	}
	
	public static void display() {
		
		System.out.println("this is a static method of child class");
	}
	
	void branchName() {
		
		System.out.println("student brancg is: " + this.branch);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(101, "ABC");
		
		Btech b = new Btech();
		
		s.info();  // call parent class method 
		
		Btech.display();
		
		b.branchName();

	}

}

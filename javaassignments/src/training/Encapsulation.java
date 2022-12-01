package training;

class Student1{
	
	private int id;
	private String name;
	
	public int getId() {
		
		return id;
	}
	
	public int setId(int id) {
		
		return this.id = id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String setName(String name) {
		
		return this.name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Encapsulatiopn : by aceiving make all tha data members and method private.
		Student1 s = new Student1();
		
		s.setId(2053);
		System.out.println(s.getId());
		
		s.setName("ABC");
		System.out.println(s.getName());

	}

}

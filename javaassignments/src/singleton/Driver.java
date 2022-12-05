package singleton;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Database db1;

	      // refers to the only object of Database
	      db1= Database.getInstance();
	      System.out.println(db1);
	      
	      db1.getConnection();

	}

}

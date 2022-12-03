package anonymousclass;

class AnonymousInter {
	
	public void createClass() {

	      // anonymous class implementing interface
	      Circle p1 = new Circle() {
	    	  
	         public void display() {
	        	 
	            System.out.println("Inside an anonymous class, through Implements Interfaces");
	         }
	      };
	      p1.display();
	 }

}

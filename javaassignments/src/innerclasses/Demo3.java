package innerclasses;

class MotherBoard {

	   // static nested class
	   static class USB{
		   
	       int usb2 = 2;
	       int usb3 = 1;
	       int getTotalPorts() {
	    	   
	           return usb2 + usb3;
	           
	       }
	       
	      /* int getTotalPorts1(){
	           // accessing the variable model of the outer classs
	           if(MotherBoard.this.model.equals("MSI")) {   // error
	               return 4;
	           }
	           else {
	               return usb2 + usb3;
	           }
	       } */
	   }

	}
	public class Demo3 {
	   public static void main(String[] args) {

	       // create an object of the static nested class
	       // using the name of the outer class
		   
	       MotherBoard.USB usb = new MotherBoard.USB();
	       System.out.println("Total Ports = " + usb.getTotalPorts());
	   }
	}
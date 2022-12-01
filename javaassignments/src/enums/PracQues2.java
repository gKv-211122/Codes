package enums;

enum Months	{
	
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class PracQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Months[] mons = Months.values();
		for (Months mon : mons)	{
			
			System.out.print(mon + " ");
		}

	}

}

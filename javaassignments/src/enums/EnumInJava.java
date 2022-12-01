package enums;

enum Cost {

	SILVER, GOLD, PLATINUM, DIAMOND;
	
}

public class EnumInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cost b1 = Cost.DIAMOND;
		switch (b1)
		{
			case SILVER:
				System.out.println("SILVER");
				break;
			case GOLD:
				System.out.println("GOLD ");
				break;
			case PLATINUM:
				System.out.println("PLATINUM");
				break;
			default:
				System.out.println("Too cost");
		}
	}

}

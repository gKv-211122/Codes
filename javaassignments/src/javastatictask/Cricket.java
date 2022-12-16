package javastatictask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Cricket {
	
	Scanner sc = new Scanner(System.in);

	public int slotNumber;
	public int timeSolt;
	public String userName;
	public static char ch;
	
	ArrayList<Integer> slot = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
	
	Map<Integer, String> oneHourTimeSlot = Map.of(1, "10am-12pm", 2, "12pm-1pm", 3, "1pm-3pm", 4, "3pm-5pm", 5,
			"5pm-6pm");
	
	public void cricketSlot() {
		
		System.out.println("(Slots, Cricket):  Total slots are: " + slot.size());
		Iterator<Integer> iterS = slot.iterator();

		while (iterS.hasNext()) {

			System.out.print(iterS.next() + "  ");
		}

		System.out.println("\n");

		
	}
	
	public void maintaingCricketTimelots() {

		Iterator<String> iterate = oneHourTimeSlot.values().iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

	}

	public void bookSlotForBadminton() {

		do {

			try {

				

				System.out.println("Enter Your Name: ");
				userName = sc.next();
				while (!userName.matches("[a-zA-Z]+")) {

					System.out.println("Please Enter a Valid Name");
					System.out.println("Enter Your Name: ");
					userName = sc.next();
				}

				System.out.println("Enter which slot you want to book  [Each Slot Having 2 Hour]");
				slotNumber = sc.nextInt();
				// timeSolt = sc.next();

				if (slotNumber > 5) {

					System.out.println("Please Enter Slot bet. 1 - 5");
				} else if (slot.contains(slotNumber)) { 
					

					
					System.out.println("Available Time Slots Are: ");
					maintaingCricketTimelots();
					slot.remove(slotNumber);

					System.out.println("\nChose Your Time Slot between. [1 - 5]: ");
					timeSolt = sc.nextInt();

					while (!oneHourTimeSlot.containsKey(timeSolt)) {

						System.out.println("Time Slot is already bookoed !! Please Chose Another One");
						System.out.println("\nChose Your Time Slot bet. [1 - 5]: ");

						timeSolt = sc.nextInt();

					}
					Object value = null;
					for (Map.Entry<Integer, String> iter : oneHourTimeSlot.entrySet()) {
						
						if (iter.getKey() == timeSolt) {
							
							value = iter.getValue();
							
						}

					}
					
					System.out.println("You Have Succefully Booked Your Slot: ");
					System.out.println("Name: " + userName + " : Slot Number " + slotNumber + " : Time Slot "
							+ value);
					
					oneHourTimeSlot.remove(timeSolt);

				} else {

					System.out.println(
							"slot is allready booked or time slot is also booked , please chose another slot or other time slot");

				}

			} catch (Exception e) {

				System.out.println(
						"Please Enter a valid input, Chose slots between 1 - 5 and chosen slot should be a Integer Number");
			}

			System.out.println("Enter to continue with Badmainton Sport , y  and For Exit Enter, n");
			ch = sc.next().charAt(0);
			if (ch == 'n') {
				System.exit(0);
			}

		} while (ch == 'y');

	}
}

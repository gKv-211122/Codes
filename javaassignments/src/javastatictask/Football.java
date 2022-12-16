package javastatictask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Football {
	
	Scanner sc = new Scanner(System.in);

	public int slotNumber;
	public int timeSolt;
	public String userName;
	public static char ch;
	
	
	ArrayList<Integer> slot = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
	
	Map<Integer, String> oneHourTimeSlot = Map.of(1, "10am-11am", 2, "11am-12pm", 3, "12pm-1pm", 4, "1pm-2pm", 5,
			"2pm-3pm", 6, "3pm-4pm", 7, "4pm-5pm", 8, "5pm-6pm", 9, "6pm-7pm", 10, "7pm-8pm");
	
	/*
	 * 
	 * , 11, "11pm-12am", 12, "12am-1am", 13, "1am-2m", 14, "2am-3am", 15,
			"3am-4am", 16, "4am-5am", 17, "4pm-5pm", 18, "6am-7am", 19, "7am-8am", 20, "8am-9am"*/
	
	public void footballSlot() {
		
		System.out.println("(Slots, BADMINTON):  Total slots are: " + slot.size());
		Iterator<Integer> iterS = slot.iterator();

		while (iterS.hasNext()) {

			System.out.print(iterS.next() + "  ");
		}

		System.out.println("\n");
		
	}
	
	public void maintaingFootballTimelots() {

		Iterator<String> iterate = oneHourTimeSlot.values().iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

	}

	public void bookSlotForFootball() {

		do {

			try {

				

				System.out.println("Enter Your Name: ");
				userName = sc.next();
				while (!userName.matches("[a-zA-Z]+")) {

					System.out.println("Please Enter a Valid Name");
					System.out.println("Enter Your Name: ");
					userName = sc.next();
				}

				System.out.println("Enter which slot you want to book  [Each Slot Having 30 Minutes]");
				slotNumber = sc.nextInt();
				// timeSolt = sc.next();

				if (slotNumber > 20) {

					System.out.println("Please Enter Slot bet. 1 - 20");
				} else if (slot.contains(slotNumber)) { 
					
					System.out.println("Available Time Slots Are: ");
					maintaingFootballTimelots();
					slot.remove(slotNumber);

					System.out.println("\nChose Your Time Slot between. [1 - 20]: ");
					timeSolt = sc.nextInt();

					while (!oneHourTimeSlot.containsKey(timeSolt)) {

						System.out.println("Time Slot is already bookoed !! Please Chose Another One");
						System.out.println("\nChose Your Time Slot bet. [1 - 20]: ");

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
						"Please Enter a valid input, Chose slots between 1 - 20 and chosen slot should be a Integer Number");
			}

			System.out.println("Enter to continue with Badmainton Sport , y  and For Exit Enter, n");
			ch = sc.next().charAt(0);
			if (ch == 'n') {
				System.exit(0);
			}

		} while (ch == 'y');

	}

	
	
	
	

}

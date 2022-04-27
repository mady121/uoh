package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public final class Groups_Exer {

	public String d = null;
	String exe_name = null;
	String time_slot = null;
	int fees = 0;

	Scanner s = new Scanner(System.in);

	static Groups_Exer grp;

	public Groups_Exer() {

		System.out.println("Type  \n 1 Saturday \n 2 Sunday\n");
		d = s.next();

		System.out.println("1=>Yoga\n2=>Zumba\n3=>Aquacise\n4=>BoxFit\n5=>BodyBlitz");
		System.out.println("Enter the name of Group Exercise from the above list");

		exe_name = s.next();

		if (d.equals("1") && exe_name.equalsIgnoreCase("1") || exe_name.equalsIgnoreCase("2")
				|| exe_name.equalsIgnoreCase("3") || exe_name.equalsIgnoreCase("4") || exe_name.equalsIgnoreCase("5")) {
			Saturday_Class();
		}

		else if (d.equals("2") && exe_name.equalsIgnoreCase("1") || exe_name.equalsIgnoreCase("2")
				|| exe_name.equalsIgnoreCase("3") || exe_name.equalsIgnoreCase("4") || exe_name.equalsIgnoreCase("5")) {

			Sunday_Class();
		}

	}

	private void Saturday_Class() {
		System.out
				.println("\nSelect Time Slot\n1.Morning: 8:00-11:00\n2.Afternoon: 12:00-3:00\n3.Evening: 6:30-9:30\n");

		int slot = 0;
		if (exe_name.equalsIgnoreCase("zumba")) {
			fees = 400;
		} else if (exe_name.equalsIgnoreCase("Aquacise")) {
			fees = 450;
		} else if (exe_name.equalsIgnoreCase("yoga")) {
			fees = 500;
		} else if (exe_name.equalsIgnoreCase("BoxFit")) {
			fees = 480;
		} else if (exe_name.equalsIgnoreCase("BodyBlitz")) {
			fees = 400;
		}

		slot = s.nextInt();

		switch (slot) {
		case 1:
			time_slot = "Morning: 8:00-11:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name
					+ "\nShift: " + " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();

			break;

		case 2:
			time_slot = "Afternoon: 12:00-3:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;

		case 3:
			time_slot = "Evening: 6:30-9:30";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;
		default:
			System.out.println("Invalid Input\nProvide a valid one\n");
			break;
		}

	}

	private void Sunday_Class() {
		System.out
				.println("\nSelect Time Slot\n1.Morning: 8:00-11:00\n2.Afternoon: 12:00-3:00\n3.Evening: 6:30-9:30\n");

		int slot = 0;

		slot = s.nextInt();
		if (exe_name.equalsIgnoreCase("zumba")) {
			fees = 400;
		} else if (exe_name.equalsIgnoreCase("Aquacise")) {
			fees = 450;
		} else if (exe_name.equalsIgnoreCase("yoga")) {
			fees = 500;
		} else if (exe_name.equalsIgnoreCase("BoxFit")) {
			fees = 480;
		} else if (exe_name.equalsIgnoreCase("BodyBlitzSunday")) {
			fees = 400;
		}
		switch (slot) {
		case 1:
			time_slot = "Morning: 8:00-11:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name
					+ "\nShift: " + " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;

		case 2:
			time_slot = "Afternoon: 12:00-3:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;

		case 3:
			time_slot = "Evening: 6:30-9:30";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;
		default:
			System.out.println("Invalid Input\nProvide a valid one");
			break;
		}

	}

	private void another_booking() {

		String ch = null;
		System.out.println("Do you want to book another Exercise class???\nPress y for Yes\nPress n for No\n");
		ch = s.next();

		switch (ch) {
		case "y":
			grp = new Groups_Exer();
			break;
		case "n":
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

	public void bookingList() {
		ArrayList<String> lt = new ArrayList<>(); // STRING ARRAY LIST FOR STORING BOOKING//
		lt.add("Day: " + " " + d);
		lt.add("Enrolled Class: " + " " + exe_name);
		lt.add("Time Slot: " + " " + time_slot);
		lt.add("Fees: " + " " + fees);
		// for-each loop for traversing the list//
		lt.forEach((a) -> {
			System.out.println(a + "\n");
		});

	}
}

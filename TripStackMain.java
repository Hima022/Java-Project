package project.tripstack.java;
import java.util.Scanner;

public class TripStackMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 BookingSystem system = new BookingSystem();

	        System.out.println("===== TripStack =====");

	        System.out.print("From: ");
	        String from = sc.nextLine();

	        System.out.print("To: ");
	        String to = sc.nextLine();

	        System.out.println("\nAvailable Trips:");
	        system.searchAll(from, to);

	        System.out.print(
	          "\nEnter Trip ID to book: ");

	        String id = sc.nextLine();

	        BookingThread t1 =
	            new BookingThread(system, id);

	        BookingThread t2 =
	            new BookingThread(system, id);

	        t1.setName("User-1");
	        t2.setName("User-2");

	        t1.start();
	        t2.start();
	    }
	




}


		       
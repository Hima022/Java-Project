package project.tripstack.java;

	public class BookingThread extends Thread {

	    private BookingSystem system;
	    private String tripId;

	    public BookingThread(BookingSystem system,
	                         String tripId) {

	        this.system = system;
	        this.tripId = tripId;
	    }

	    public void run() {

	        boolean success = system.book(tripId);

	        if (success) {

	            System.out.println(
	              Thread.currentThread().getName()
	              + " SUCCESS");

	        } else {

	            System.out.println(
	              Thread.currentThread().getName()
	              + " FAILED");
	        }
	    }
	}


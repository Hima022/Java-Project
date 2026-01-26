package project.tripstack.java;

public class Trip {

	    private String id;
	    private String from;
	    private String to;
	    private double price;
	    private int seats;
	    private String type;

	    public Trip(String id, String from, String to,
	                double price, int seats, String type) {

	        this.id = id;
	        this.from = from;
	        this.to = to;
	        this.price = price;
	        this.seats = seats;
	        this.type = type;
	    }

	    public String getId() { return id; }
	    public String getFrom() { return from; }
	    public String getTo() { return to; }
	    public double getPrice() { return price; }
	    public int getSeats() { return seats; }
	    public String getType() { return type; }

	    public synchronized boolean reserveSeat() {

	        if (seats > 0) {
	            seats--;
	            return true;
	        }
	        return false;
	    }

	    public void print() {

	        System.out.println(
	                id + " | " + type +
	                " | " + from + " -> " + to +
	                " | ₹" + price +
	                " | Seats: " + seats);
	    }
	}



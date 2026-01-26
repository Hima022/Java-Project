package project.tripstack.java;

public class BookingSystem {


	    private TransportService[] services;

	    public BookingSystem() {

	        services = new TransportService[4];

	        services[0] = new BusService();
	        services[1] = new TrainService();
	        services[2] = new FlightService();
	        services[3] = new CarService();
	    }

	    public void searchAll(String from, String to) {

	        for (int i = 0; i < services.length; i++) {

	            services[i].search(from, to);
	        }
	    }

	    public synchronized boolean book(String id) {

	        for (int i = 0; i < services.length; i++) {

	            if (services[i].bookSeat(id)) {

	                System.out.println(
	                    "Booked via " +
	                    services[i].getServiceName());

	                return true;
	            }
	        }
	        return false;
	    }
	}


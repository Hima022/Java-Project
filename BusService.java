package project.tripstack.java;

public class BusService implements TransportService {

	    private Trip[] trips;

	    public BusService() {

	        trips = new Trip[2];

	        trips[0] =
	            new Trip("Bus-1","Hyderabad","Bangalore",900,3,"Bus");

	        trips[1] =
	            new Trip("Bus-2","Hyderabad","Chennai",700,4,"Bus");
	    }

	    public void search(String from, String to) {

	        for (int i = 0; i < trips.length; i++) {

	            if (trips[i].getFrom().equalsIgnoreCase(from)
	                    &&
	                trips[i].getTo().equalsIgnoreCase(to)) {

	                trips[i].print();
	            }
	        }
	    }

	    public boolean bookSeat(String id) {

	        for (int i = 0; i < trips.length; i++) {

	            if (trips[i].getId().equals(id)) {

	                return trips[i].reserveSeat();
	            }
	        }
	        return false;
	    }

	    public String getServiceName() {
	        return "Bus";
	    }
	}


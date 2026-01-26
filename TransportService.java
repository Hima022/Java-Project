package project.tripstack.java;
 public interface TransportService {

    void search(String from, String to);

    boolean bookSeat(String tripId);

    String getServiceName();
}


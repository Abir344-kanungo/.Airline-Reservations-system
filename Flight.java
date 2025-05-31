public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;

    public Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getRoute() {
        return origin + " to " + destination;
    }
}


public class Ticket {
    private String ticketNumber;
    private Flight flight;
    private Passenger passenger;
    private double price;

    public Ticket(String ticketNumber, Flight flight, Passenger passenger, double price) {
        this.ticketNumber = ticketNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
    }

    public void printTicket() {
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Flight: " + flight.getFlightNumber() + " | " + flight.getRoute());
        System.out.println("Price: $" + price);
    }
}


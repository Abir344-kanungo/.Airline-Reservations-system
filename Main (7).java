public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Alice Johnson", "P123456");
        Passenger p2 = new Passenger("Bob Smith", "P654321");

        Employee e1 = new Employee("E001", "John Pilot", "Captain");

        Flight f1 = new Flight("FL123", "New York", "London");
        Flight f2 = new Flight("FL456", "Tokyo", "Paris");

        Ticket t1 = new Ticket("T1001", f1, p1, 1200.00);
        Ticket t2 = new Ticket("T1002", f2, p2, 1400.00);

        Reservation reservation = new Reservation();
        reservation.bookTicket(t1);
        reservation.bookTicket(t2);

        System.out.println("\nAll Booked Tickets:");
        reservation.showAllTickets();
    }
}

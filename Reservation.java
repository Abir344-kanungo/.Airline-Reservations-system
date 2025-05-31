import java.util.ArrayList;

public class Reservation {
    private ArrayList<Ticket> bookedTickets = new ArrayList<>();

    public void bookTicket(Ticket ticket) {
        bookedTickets.add(ticket);
        System.out.println("Ticket booked successfully for " + ticket.passenger.getName());
    }

    public void showAllTickets() {
        for (Ticket ticket : bookedTickets) {
            ticket.printTicket();
            System.out.println("------------");
        }
    }
}

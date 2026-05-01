package _chapter6_ticket_refactor;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long setTicket(Ticket ticket) {
        if (this.bag.hasInvitation()) {
            this.bag.setTicket(ticket);
            return 0L;
        } else {
            this.bag.setTicket(ticket);
            this.bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}

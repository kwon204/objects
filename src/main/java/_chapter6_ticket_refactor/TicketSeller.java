package _chapter6_ticket_refactor;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        this.ticketOffice.minusAmount(audience.buy(this.ticketOffice.getTicket()));
    }
}

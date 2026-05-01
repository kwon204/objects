package _chapter6_ticket_refactor;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void setTicket(Audience audience) {
        this.ticketOffice.minusAmount(audience.setTicket(this.ticketOffice.getTicket()));
    }
}

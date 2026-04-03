package _chapter1_ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 티켓을 판매한다.
    public Ticket getTicket() {
        return tickets.removeFirst();
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }



}

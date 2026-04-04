package _chapter1_ticket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Theater 클래스")
class TheaterTest {

    @Nested
    @DisplayName("enter 메소드는")
    class Enter {
        private Theater theater;

        @BeforeEach
        void setUp() {
            TicketOffice ticketOffice = new TicketOffice(0L, new Ticket(100L));
            TicketSeller ticketSeller = new TicketSeller(ticketOffice);
            theater = new Theater(ticketSeller);
        }

        @Test
        @DisplayName("초대장을 들고 온 관람객을 입장시킨다.")
        void test01() {
            // given
            Invitation invitation = new Invitation();
            Bag bag = new Bag(invitation, 0L);
            Audience audience = new Audience(bag);

            // when
            theater.enter(audience);

            // then
            assertTrue(bag.hasTicket());
        }

        @Test
        @DisplayName("현금을 들고 온 관람객을 입장시킨다.")
        void test02() {
            // given
            Invitation invitation = new Invitation();
            Bag bag = new Bag(invitation, 300L);
            Audience audience = new Audience(bag);

            // when
            theater.enter(audience);

            // then
            assertTrue(bag.hasTicket());
        }

    }


}
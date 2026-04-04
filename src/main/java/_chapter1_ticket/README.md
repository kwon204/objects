# 티켓 판매 애플리케이션

## 소프트웨어 모듈이 가지는 세 가지 기능

- 제대로 동작한다. 
- 변경에 용이하다. 
- 코드를 읽는 사람과 의사소통한다.

### 지금 코드의 문제점
```java
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller =  ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
```

- 관람객과 판매원이 소극장의 통제를 받는다. 
  - 소극장이 관람객의 가방을 열어서 초대장을 꺼내고 현금을 꺼낸다. 
  - 소극장이 판매원 허락도 없이 매표소에서 표를 꺼낸다.
- 코드 이해를 위해 여러 가지 세부적인 내용을 알고 있어야 한다. 
  - `Audience`가 `Bag`를 가지고 있고, `Bag` 에는 현금과 초대장이 있고...
  - `TicketSeller`가 `TicketOffice`에서 티켓을 판매하고, ...
- 무엇보다 변경에 취약하다. 
  - `Audience`와 `TicketSeller`를 변경하면 `Theater`도 변경해야 한다.


#### 개선 목표

- `Theater`가 가진 많은 클래스 의존성을 줄여서 객체 사이의 결합도를 낮추자. 
- 결합도를 낮춰서 변경에 용이한 설계로 만들자.

---

## 설계 원칙
- 객체를 인터페이스와 구현으로 나누고 인터페이스만 공개한다.
- 캡슐화는 변경 용이성을 개선한다. 
- 캡슐화를 통해 객체들이 메시지를 통해서만 상호작용하도록 만든다.
- 자율적인 객체는 결합도를 낮추고 응집도를 높인다. 
- 하나의 기능에 여러 객체가 참여하면, 책임도 여러 객체에게 분산되어야 한다.
- 객체지향에서는 데이터와 프로세스를 하나의 단위로 통합한다. 
- 

## 용어
- 자율적인 객체: 자신의 데이터를 스스로 처리하는 객체
- 결합도가 낮다.: 불필요한 의존성이 없고 필요한 메시지를 통해서만 상호작용한다.
- 응집도가 높다.: 밀접하게 연관된 작업만을 수행하고 연관성 없는 작업은 다른 객체에게 위임하는 객체

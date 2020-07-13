package chapter2;

public class bank {
    public static void main(String[] args) {
        TicketWindow ticketWindow1 = new TicketWindow("1号柜台");
        TicketWindow ticketWindow2 = new TicketWindow("2号柜台");
        TicketWindow ticketWindow3 = new TicketWindow("3号柜台");

        ticketWindow1.start();
        ticketWindow2.start();
        ticketWindow3.start();
    }
}

package org.hyunjoon.designpattern.singleton;

public class TicketMaker {
    private static int ticket;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
        ticket = 1000;
    }

    public static TicketMaker getTicketMaker() {
        return ticketMaker;
    }

    public static int getNextTicketNumber() {
        return ticket++;
    }
}

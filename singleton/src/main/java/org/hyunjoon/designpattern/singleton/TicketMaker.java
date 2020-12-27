package org.hyunjoon.designpattern.singleton;

public class TicketMaker {
    private static int ticket;
    private static TicketMaker ticketMaker = new TicketMaker();

    // cannot extend Singleton
    // 1. private constructor of Singleton > change to protected
    // 2. getInstance method returns Singleton instance, not TicketMaker - cannot call getNextTicketNumber method

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

package org.hyunjoon.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TicketMakerTest {
    @Test
    public void ticketMakerSingletonTest() {
        TicketMaker maker1 = TicketMaker.getTicketMaker();
        TicketMaker maker2 = TicketMaker.getTicketMaker();
        Assert.assertEquals(maker1, maker2);
    }

    @Test
    public void ticketNumberTest() {
        TicketMaker maker1 = TicketMaker.getTicketMaker();
        TicketMaker maker2 = TicketMaker.getTicketMaker();
        maker1.getNextTicketNumber();
        maker2.getNextTicketNumber();
        Assert.assertEquals(1002, maker1.getNextTicketNumber());
    }
}

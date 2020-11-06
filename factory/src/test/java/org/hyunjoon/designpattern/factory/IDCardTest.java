package org.hyunjoon.designpattern.factory;

import org.hyunjoon.designpattern.factory.framework.Factory;
import org.hyunjoon.designpattern.factory.framework.Product;
import org.hyunjoon.designpattern.factory.idcard.IDCard;
import org.hyunjoon.designpattern.factory.idcard.IDCardFactory;
import org.junit.Assert;
import org.junit.Test;

public class IDCardTest {
    @Test
    public void idCardTest() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("John", 111);
        Product card2 = factory.create("tlwpdus", 222);
        Product card3 = factory.create("Mo", 333);
        Product card4 = factory.create("Gon", 444);

        card1.use(100);
        card3.use(333);

        IDCard tmpCard = (IDCard) card2;
        Assert.assertEquals("tlwpdus", tmpCard.getOwner());
        IDCardFactory tmpFactory = (IDCardFactory) factory;
        Assert.assertEquals(tmpFactory.getOwners().get(3), card4);
    }
}

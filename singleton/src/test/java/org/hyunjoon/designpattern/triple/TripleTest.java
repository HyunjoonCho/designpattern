package org.hyunjoon.designpattern.triple;

import org.junit.Assert;
import org.junit.Test;

public class TripleTest {
    @Test
    public void tripleTest() {
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(1);
        Assert.assertNotEquals(triple1, triple2);
        Assert.assertEquals(triple1, triple3);
    }
}

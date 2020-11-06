package org.hyunjoon.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void singletonTest() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);
    }
}

package org.hyunjoon.designpattern.adapter.composition;

import org.junit.Test;

public class ObjectAdapterTest {
    private Print print;

    @Test
    public void PrintBannerTest(){
        print = new PrintBanner("hello object");
        print.printWeak();
        print.printStrong();
    }
}

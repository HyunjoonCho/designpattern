package org.hyunjoon.designpattern.adapter.inheritance;

import org.junit.Test;

public class ClassAdapterTest {
    private Print print;
    // Print not PrintBanner which might have its own methods - out of Target spec

    @Test
    public void PrintBannerTest(){
        print = new PrintBanner("hello class");
        print.printWeak();
        print.printStrong();
        //assert on stdout https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    }
}

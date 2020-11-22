package org.hyunjoon.designpattern.decorator;

import org.junit.Test;

public class BorderTest {
    @Test
    public void simpleBorderTest() {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
    }

    @Test
    public void borderLayeringTest() {
        Display b4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("HELLO")
                                ),
                                '*'
                        )
                ),
                '/'
        );
         b4.show();
    }

    @Test
    public void upDownBorderTest() {
        Display b = new FullBorder(
                new UpDownBorder(
                        new SideBorder(
                                new StringDisplay("YEEEEP"),
                                '*'
                        ),
                        '/'
                )
        );
        b.show();
    }

    @Test
    public void multiDisplayTest() {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Good Morning");
        md.add("Hello");
        md.add("Good Night and See You Tomorrow");

        md.show();

        Display d = new FullBorder(
                new SideBorder(
                        md,
                        '*'
                )
        );

        d.show();
    }
}

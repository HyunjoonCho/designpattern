package org.hyunjoon.designpattern.template;

import org.junit.Test;

public class DisplayTest {
    @Test
    public void CharDisplayTest() {
        AbstractDisplay abstractDisplay = new CharDisplay('O');
        abstractDisplay.display();
    }

    @Test
    public void StringDisplayTest() {
        AbstractDisplay abstractDisplay1 = new StringDisplay("HEYYY");
        abstractDisplay1.display();
        AbstractDisplay abstractDisplay2 = new StringDisplay("HEY");
        abstractDisplay2.display();
    }
}

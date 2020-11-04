package org.hyunjoon.designpattern.prototype;

import org.hyunjoon.designpattern.prototype.framework.Manager;
import org.hyunjoon.designpattern.prototype.framework.Product;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void PrototypeTest() {
        Manager manager = new Manager();
        Product msgProto = new MessageBox('*');
        Product ulProto = new UnderlinePen('_');
        manager.register("message box", msgProto);
        manager.register("underline pen", ulProto);

        Product msgBox = manager.create("message box");
        Product ulPen = manager.create("underline pen");
        msgBox.use("HELLO WORLD");
        ulPen.use("HEYYYY");

    }
}

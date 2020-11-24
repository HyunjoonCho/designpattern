package org.hyunjoon.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {
    @Override
    public void accept(Visitor v) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }
}

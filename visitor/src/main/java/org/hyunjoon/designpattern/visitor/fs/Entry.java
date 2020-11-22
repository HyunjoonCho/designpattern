package org.hyunjoon.designpattern.visitor.fs;

import org.hyunjoon.designpattern.visitor.Element;
import org.hyunjoon.designpattern.visitor.Visitor;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    @Override
    public void accept(Visitor v) {

    }
}

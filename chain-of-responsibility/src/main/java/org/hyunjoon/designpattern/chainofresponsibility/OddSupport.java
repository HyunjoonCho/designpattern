package org.hyunjoon.designpattern.chainofresponsibility;

public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}

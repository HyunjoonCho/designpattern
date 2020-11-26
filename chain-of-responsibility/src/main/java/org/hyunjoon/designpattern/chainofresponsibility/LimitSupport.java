package org.hyunjoon.designpattern.chainofresponsibility;

public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (limit > trouble.getNumber()) {
            return true;
        }
        return false;
    }
}

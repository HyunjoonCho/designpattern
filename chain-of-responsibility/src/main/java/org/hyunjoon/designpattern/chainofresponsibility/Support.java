package org.hyunjoon.designpattern.chainofresponsibility;

import java.util.Objects;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = Objects.requireNonNull(name, "name");
    }

    public Support setNext(Support next) {
        this.next = Objects.requireNonNull(next, "next");
        return next;
    }

    public final void support(Trouble trouble) {

        Support support = this;
        while (true) {
            if (support.resolve(trouble)) {
                support.done(trouble);
                break;
            }
            if (support.next == null) {
                support.fail(trouble);
                break;
            }
            support = support.next;
        }

//        if(resolve(trouble)) {
//            done(trouble);
//        } else if (next != null) {
//            next.support(trouble);
//        } else {
//            fail(trouble);
//        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}

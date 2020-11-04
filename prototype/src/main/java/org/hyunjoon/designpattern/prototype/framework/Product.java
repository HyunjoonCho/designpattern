package org.hyunjoon.designpattern.prototype.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);
    public final Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
//    public abstract Product createClone();
//    convert interface to abstract class, to implement common method createClone()
}

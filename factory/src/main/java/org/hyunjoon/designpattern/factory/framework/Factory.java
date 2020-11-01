package org.hyunjoon.designpattern.factory.framework;

public abstract class Factory {
    public final Product create(String owner, int code) {
        Product p = createProduct(owner, code);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner, int code);

    protected abstract void registerProduct(Product p);
    //WHY protected?
}

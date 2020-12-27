package org.hyunjoon.designpattern.factory.idcard;

import org.hyunjoon.designpattern.factory.framework.Factory;
import org.hyunjoon.designpattern.factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private static IDCardFactory singleton = new IDCardFactory();
    private List<Product> owners = new ArrayList();
    private Map db = new HashMap();

    private IDCardFactory() {
    }

    public static IDCardFactory getSingleton() {
        return singleton;
    }

    public Product createProduct(String owner, int code) {
        db.put(owner, code);
        return new IDCard(owner, code);
    }

    public void registerProduct(Product p) {
        owners.add(p);
    }

    public List<Product> getOwners() {
        return owners;
    }
}

package org.hyunjoon.designpattern.factory.idcard;

import org.hyunjoon.designpattern.factory.framework.Factory;
import org.hyunjoon.designpattern.factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private HashMap db = new HashMap();

    public Product createProduct(String owner, int code) {
        db.put(owner, code);
        return new IDCard(owner, code);
    }

    public void registerProduct(Product p) {
        owners.add(p);
    }

    public List getOwners() {
        return owners;
    }
}

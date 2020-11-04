package org.hyunjoon.designpattern.prototype;

import org.hyunjoon.designpattern.prototype.framework.Product;

public class UnderlinePen extends Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    public void use(String s) {
        int length = s.length();
        System.out.println("\"" + s + "\"");
        for(int i = 0; i < length + 2; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

//    public Product createClone() {
//        Product p = null;
//        try {
//            p = (Product) clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }
}

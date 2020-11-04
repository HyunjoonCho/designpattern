package org.hyunjoon.designpattern.prototype;

import org.hyunjoon.designpattern.prototype.framework.Product;

public class MessageBox extends Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    public void use(String s) {
        int length = s.length();
        for(int i=0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for(int i=0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }
//    public Product createClone() {
//        Product p = null;
//        try {
//            p = (Product) clone();
//        } catch ( CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }
}

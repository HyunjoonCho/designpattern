package org.hyunjoon.designpattern.flyweight;

import java.util.Objects;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        constructorShared(string);
    }

    public BigString(String string, boolean shared) {
        if (shared) {
            constructorShared(string);
        } else {
            Objects.requireNonNull(string, "string");
            bigChars = new BigChar[string.length()];

            for (int i = 0; i < bigChars.length; i++) {
                bigChars[i] = new BigChar(string.charAt(i));
            }
        }
    }

    private void constructorShared(String string) {
        Objects.requireNonNull(string, "string");
        bigChars = new BigChar[string.length()];

        BigCharFactory factory = BigCharFactory.getInstance();

        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}

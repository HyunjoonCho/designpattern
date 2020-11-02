package org.hyunjoon.designpattern.triple;

public class Triple {
    private static Triple triple1 = new Triple();
    private static Triple triple2 = new Triple();
    private static Triple triple3 = new Triple();

    private Triple() {
        System.out.println("Create Triple");
    }

    public static Triple getInstance(int id) {
        switch (id) {
            case 1:
                return triple1;
            case 2:
                return triple2;
            case 3:
                return triple3;
            default:
                System.out.println("Out of Range");
        }
        return null;
    }
}

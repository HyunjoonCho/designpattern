package org.hyunjoon.designpattern.factory.idcard;

import org.hyunjoon.designpattern.factory.framework.Product;

import java.util.Scanner;

public class IDCard extends Product {
    private String owner;
    private int code;

    IDCard(String owner, int code) {
        System.out.println("Creating " + owner + "`s Card");
        this.owner = owner;
        this.code = code;
    }

    public void use(int input) {
//        System.out.print("Type authentication code: ");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
        if(input == code) {
            System.out.println("Using " + owner + "`s Card");
        } else {
            System.out.println("Wrong code for " + owner);
        }
    }

    public String getOwner() {
        return owner;
    }
}

package org.hyunjoon.designpattern.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsName = {
            "apple", "grape", "banana", "tangerine"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Your money increased");
        } else if (dice == 2) {
             money /= 2;
             System.out.println("Your money became half");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("Received fruit (" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("Nothing has changed");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("delicious")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "delicious ";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}

package org.hyunjoon.designpattern.memento;

import org.hyunjoon.designpattern.memento.game.Gamer;
import org.hyunjoon.designpattern.memento.game.Memento;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MementoTest {
    @Test
    public void mementoTest() {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("Current: " + gamer);

            gamer.bet();

            System.out.println("You have " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println(" (save since money increased)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()){
                System.out.println(" (restore since money decreased)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
            System.out.println();
        }
    }

    @Test
    public void serializableMementoTest() {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        try {
            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("game.dat"));
            memento = (Memento) objectInput.readObject();
            gamer.restoreMemento(memento);
        } catch (Exception e) {
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("====" + i);
            System.out.println("Current: " + gamer);

            gamer.bet();

            System.out.println("You have " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println(" (save since money increased)");
                memento = gamer.createMemento();
                try {
                    ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("game.dat"));
                    objectOutput.writeObject(memento);
                } catch (Exception e){
                }

            } else if (gamer.getMoney() < memento.getMoney()){
                System.out.println(" (restore since money decreased)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
            System.out.println();
        }
    }
}

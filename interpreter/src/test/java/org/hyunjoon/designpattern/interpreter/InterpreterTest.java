package org.hyunjoon.designpattern.interpreter;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class InterpreterTest {
    @Test
    public void programInterpreterTest() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

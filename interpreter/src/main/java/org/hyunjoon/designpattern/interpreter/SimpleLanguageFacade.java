package org.hyunjoon.designpattern.interpreter;

import org.hyunjoon.designpattern.interpreter.parser.Context;
import org.hyunjoon.designpattern.interpreter.parser.Node;
import org.hyunjoon.designpattern.interpreter.parser.ProgramNode;
import org.hyunjoon.designpattern.interpreter.visualizer.SimpleLanguageFrame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimpleLanguageFacade {
    private SimpleLanguageFrame frame;

    public SimpleLanguageFacade(SimpleLanguageFrame frame) {
        this.frame = Objects.requireNonNull(frame, "simpleLanguageFrame");
    }

    public void interpret(String fileName) {
        List<Node> nodeList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(Objects.requireNonNull(fileName, "fileName")));

            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                nodeList.add(node);
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        frame.setNodeList(nodeList);
    }
}

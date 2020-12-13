package org.hyunjoon.designpattern.interpreter.visualizer;

import org.hyunjoon.designpattern.interpreter.parser.Context;
import org.hyunjoon.designpattern.interpreter.parser.Node;
import org.hyunjoon.designpattern.interpreter.parser.ParseException;
import org.hyunjoon.designpattern.interpreter.parser.ProgramNode;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Objects;

public class SimpleLanguageFrame extends JFrame {
    private SimpleLanguageCanvas canvas;
    private TextField textField;
//    private JButton prevButton, nextButton;
//    private int currentNode;
//    private List<Node> nodeList;

    public SimpleLanguageFrame(String title, SimpleLanguageCanvas canvas) {
        super(Objects.requireNonNull(title, "title"));
        this.canvas = Objects.requireNonNull(canvas, "canvas");
//        prevButton = new JButton("prev");
//        nextButton = new JButton("next");
        textField = new TextField("Type Simple Program");
        setupFrame();
    }

    public void setupFrame() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        textField.addActionListener(this::actionPerformed);
        textField.setBackground(Color.WHITE);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(textField);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == textField) {
            String text = textField.getText();
            try {
                canvas.clear();
                Node node = new ProgramNode();
                node.parse(new Context(text, canvas));
                node.draw();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
//        if (e.getSource() == prevButton) {
//            nextButton.setEnabled(true);
//            if (currentNode == 1) {
//                prevButton.setEnabled(false);
//            }
//            drawNode(currentNode--);
//        } else {
//            prevButton.setEnabled(true);
//            if (currentNode == nodeList.size() - 2) {
//                nextButton.setEnabled(false);
//            }
//            drawNode(currentNode++);
//        }
    }

//    public void setNodeList(List<Node> nodeList) {
//        this.nodeList = Objects.requireNonNull(nodeList, "nodeList");
//        currentNode = 0;
//        drawNode(0);
//    }
//
//    public void drawNode(int nodeIndex) {
//        Node node = nodeList.get(nodeIndex);
//        canvas.draw(node);
//    }
}
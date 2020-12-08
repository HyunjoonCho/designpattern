package org.hyunjoon.designpattern.command.drawer;

import org.hyunjoon.designpattern.command.Command;
import org.hyunjoon.designpattern.command.MacroCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

//@Component
//@ComponentScan(basePackages = "org.hyunjoon.designpattern.command")
public class DrawFrame extends JFrame {
    private MacroCommand history;
//    @Autowired
    private DrawCanvas canvas;
    private JButton clearButton;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    private JButton undoButton;

    public DrawFrame(String title, DrawCanvas canvas) {
        super(Objects.requireNonNull(title, "title"));

        this.canvas = Objects.requireNonNull(canvas, "canvas");
        history = canvas.getHistory();
        clearButton = new JButton("clear");
        redButton = new JButton("red");
        greenButton = new JButton("green");
        blueButton = new JButton("blue");
        undoButton = new JButton("undo");
        setupFrame();
    }

    public void setupFrame() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                appendAndExecute(new DrawCommand(canvas, e.getPoint()));
            }
        });
        clearButton.addActionListener(this::actionPerformed);
        redButton.addActionListener(this::actionPerformed);
        greenButton.addActionListener(this::actionPerformed);
        blueButton.addActionListener(this::actionPerformed);
        undoButton.addActionListener(this::actionPerformed);
//      cannot replace with lambda for upper two - have multiple overriding methods
//      no need to implement ActionListener but only the method
//      better to use one method as a Listener than writing lambda for each

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            appendAndExecute(new ColorCommand(canvas, Color.RED));
        } else if (e.getSource() == greenButton) {
            appendAndExecute(new ColorCommand(canvas, Color.GREEN));
        } else if (e.getSource() == blueButton) {
            appendAndExecute(new ColorCommand(canvas, Color.BLUE));
        } else if (e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
//            TODO: undo changes COLOR -> drawCommand have to store its color
//            TODO: may group commands so that undo button can undo that group of commands/dots
        }
    }

    public void appendAndExecute(Command command) {
        history.append(command);
        command.execute();
    }
}

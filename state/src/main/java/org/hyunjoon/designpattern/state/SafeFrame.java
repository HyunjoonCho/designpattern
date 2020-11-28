package org.hyunjoon.designpattern.state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("Use Safe");
    private Button buttonAlarm = new Button("Alert!");
    private Button buttonPhone = new Button("Call Security Center");
    private Button buttonExit = new Button("Exit");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(true);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this::actionPerformed);
        buttonAlarm.addActionListener(this::actionPerformed);
        buttonPhone.addActionListener(this::actionPerformed);
        buttonExit.addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());

        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        StringBuilder builder = new StringBuilder("It is ");
        if (hour < 10) {
            builder.append("0").append(hour).append(":00");
        } else {
            builder.append(hour).append(":00");
        }
        System.out.println(builder.toString());
        textClock.setText(builder.toString());
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("State changed from " + this.state + " to " + state + ".");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record... " + msg + "\n");
    }
}

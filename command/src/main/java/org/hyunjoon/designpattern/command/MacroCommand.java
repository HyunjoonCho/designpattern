package org.hyunjoon.designpattern.command;

import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands;

    public MacroCommand() {
        commands = new Stack<>();
    }

    @Override
    public void execute() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute();
        }
    }

    public void append(Command command) {
        Objects.requireNonNull(command, "command");
        if (command != this) {
            commands.push(command);
        }
    }

    public void undo(){
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }

}

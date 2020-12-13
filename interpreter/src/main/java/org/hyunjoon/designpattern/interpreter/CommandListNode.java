package org.hyunjoon.designpattern.interpreter;

import java.util.ArrayList;
import java.util.List;

public class CommandListNode extends Node {
    List<Node> nodeList = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if(context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                nodeList.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return nodeList.toString();
    }
}

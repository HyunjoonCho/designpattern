package org.hyunjoon.designpattern.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JSONBuilder implements Builder {
    private ObjectMapper mapper = new ObjectMapper();
    private ObjectNode node;
    private boolean isTitled = false;
    private boolean isClosed = false;
    private String result;
    private int stringCount = 1;
    private int itemsCount = 1;

    public void makeTitle(String title) {
        isTitled = true;
        node = mapper.createObjectNode();
        node.put("title", title);
    }

    public void makeString(String str) {
        if(!isTitled) {
            makeTitle("untitled");
        }
        node.put("str".concat(String.valueOf(stringCount++)), str);
    }

    public void makeItems(String[] items) {
        if(!isTitled) {
            makeTitle("untitled");
        }
        ArrayNode arrayNode = node.putArray("items".concat(String.valueOf(itemsCount++)));
        for (String item : items) {
            arrayNode.add(item);
        }
    }

    public void close() {
        if(!isTitled) {
            makeTitle("untitled");
        }
        isClosed = true;
        try {
            result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getResult() {
        if(!isClosed) {
            close();
        }
        return result;
    }
}

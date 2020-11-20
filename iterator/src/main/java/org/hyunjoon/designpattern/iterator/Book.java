package org.hyunjoon.designpattern.iterator;

import java.util.Objects;

public class Book{
    private String title;
    public Book(String title){
        this.title = Objects.requireNonNull(title, "title");
    }
    public String getTitle(){
        return title;
    }
}
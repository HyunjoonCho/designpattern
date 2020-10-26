package main.java.org.hyunjoon.designpattern.iterator;

public class Book{
    private String name;
    public Book(String name){
        // if(name == null) throw exception
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
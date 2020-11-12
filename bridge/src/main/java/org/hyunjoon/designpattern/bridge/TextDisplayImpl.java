package org.hyunjoon.designpattern.bridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDisplayImpl extends DisplayImpl {
    private final String fileName;
    private File file;
    private FileReader reader;

    public TextDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    public void rawOpen() {
        file = new File(fileName);
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void rawPrint() {
        try {
            int c;
            while((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rawClose() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

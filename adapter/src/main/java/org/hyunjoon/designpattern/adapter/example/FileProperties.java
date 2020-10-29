package org.hyunjoon.designpattern.adapter.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    public FileProperties() {
        super();
    }

    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(new File(filename));
        super.load(inputStream);
    }

    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File(filename));
        super.store(outputStream, "Written by FileProperties");
        outputStream.close();
    }

    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }

    public String getValue(String key) {
        return super.getProperty(key);
    }
}

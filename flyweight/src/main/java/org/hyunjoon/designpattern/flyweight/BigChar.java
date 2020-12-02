package org.hyunjoon.designpattern.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charName + ".txt")
            );
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
            reader.close();
            this.fontData = sb.toString();
        } catch (IOException e) {
            this.fontData = charName + "?.............\n";
        }
    }

    public void print() {
        System.out.print(fontData);
    }
}

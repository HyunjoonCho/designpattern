package org.hyunjoon.designpattern.visitor;

import org.hyunjoon.designpattern.visitor.fs.Directory;
import org.hyunjoon.designpattern.visitor.fs.File;
import org.hyunjoon.designpattern.visitor.fs.FileTreatmentException;
import org.junit.Test;

public class VisitorTest {
    @Test
    public void visitorTest() {
        try {
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}

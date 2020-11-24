package org.hyunjoon.designpattern.visitor;

import org.hyunjoon.designpattern.visitor.fs.Directory;
import org.hyunjoon.designpattern.visitor.fs.File;
import org.hyunjoon.designpattern.visitor.fs.FileTreatmentException;
import org.junit.Test;

import java.util.Iterator;

public class VisitorTest {
    @Test
    public void listVisitorTest() {
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

    @Test
    public void fileFindVisitor() {
        try {
            Directory usrDir = new Directory("usr");

            Directory kim = new Directory("Kim");
            Directory lee = new Directory("Lee");
            Directory park = new Directory("Park");
            usrDir.add(kim);
            usrDir.add(lee);
            usrDir.add(park);

            kim.add(new File("diary.html", 100));
            kim.add(new File("Composite.java", 200));
            lee.add(new File("memo.tex", 300));
            lee.add(new File("index.html", 350));
            park.add(new File("game.doc", 400));
            park.add(new File("junk.mail", 500));
            park.add(new File("park.html", 320));

            FileFindVisitor ffv = new FileFindVisitor(".html");
            usrDir.accept(ffv);

            System.out.println("HTML files are:");
            Iterator<File> iterator = ffv.getFoundFiles();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void elementArrayListTest() {
        try {
            Directory root1 = new Directory("root1");
            root1.add(new File("diary.html", 10));
            root1.add(new File("index.html", 20));

            Directory root2 = new Directory("root2");
            root2.add(new File("diary.html", 1000));
            root2.add(new File("index.html", 2000));
//            new File("file", 200).add(new File("what", 200));

            ElementArrayList list = new ElementArrayList();
            list.add(root1);
            list.add(root2);
            list.add(new File("etc.html", 1234));

            list.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}

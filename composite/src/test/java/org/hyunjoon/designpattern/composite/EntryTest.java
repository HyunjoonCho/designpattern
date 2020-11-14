package org.hyunjoon.designpattern.composite;

import org.junit.Test;

public class EntryTest {
    @Test
    public void fileDirectoryTest() {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));

            System.out.println("Making user entries...");
            Directory kim = new Directory("Kim");
            Directory lee = new Directory("Lee");
            Directory park = new Directory("Park");
            usrdir.add(kim);
            usrdir.add(lee);
            usrdir.add(park);
            kim.add(new File("diary.html", 100));
            kim.add(new File("Composite.java", 200));
            lee.add(new File("memo.tex", 300));
            park.add(new File("game.doc", 400));
            park.add(new File("junk.mail", 500));

            rootdir.printList(" ");

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void exceptionTest() {
        try {
            File x = new File("x", 100);
            x.printList();
            x.add(new File("na", 200));
        } catch (FileTreatmentException e) {
            System.out.println("Cannot add an Entry to file!");
            e.printStackTrace();
        }
    }

    @Test
    public void pathTest() {
        Directory root = new Directory("root");
        Directory org = new Directory("org");
        Directory hyunjoon = new Directory("hyunjoon");
        Directory designpattern = new Directory("designpattern");
        File composite = new File("Composite.java", 400);

        root.add(org);
        org.add(hyunjoon);
        hyunjoon.add(designpattern);
        designpattern.add(composite);

        composite.printPath();
    }
}

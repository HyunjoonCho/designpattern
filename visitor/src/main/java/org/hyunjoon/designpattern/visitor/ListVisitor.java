package org.hyunjoon.designpattern.visitor;

import org.hyunjoon.designpattern.visitor.fs.Directory;
import org.hyunjoon.designpattern.visitor.fs.Entry;
import org.hyunjoon.designpattern.visitor.fs.File;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir +  "/" + directory);

        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();

        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }

        currentDir = saveDir;
    }
}

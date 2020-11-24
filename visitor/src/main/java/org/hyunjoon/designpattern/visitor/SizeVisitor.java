package org.hyunjoon.designpattern.visitor;

import org.hyunjoon.designpattern.visitor.fs.Directory;
import org.hyunjoon.designpattern.visitor.fs.Entry;
import org.hyunjoon.designpattern.visitor.fs.File;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size = 0;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}

package org.hyunjoon.designpattern.visitor;

import org.hyunjoon.designpattern.visitor.fs.Directory;
import org.hyunjoon.designpattern.visitor.fs.Entry;
import org.hyunjoon.designpattern.visitor.fs.File;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class FileFindVisitor extends Visitor {
    private String fileType;
    private List<File> foundFiles;

    public FileFindVisitor(String fileType) {
        this.fileType = Objects.requireNonNull(fileType, "fileType");
        foundFiles = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }

    }

    public Iterator<File> getFoundFiles() {
        return foundFiles.iterator();
    }
}

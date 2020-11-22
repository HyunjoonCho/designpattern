package org.hyunjoon.designpattern.visitor;

import org.hyunjoon.designpattern.visitor.fs.Directory;
import org.hyunjoon.designpattern.visitor.fs.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}

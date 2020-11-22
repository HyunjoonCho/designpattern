package org.hyunjoon.designpattern.visitor.fs;

public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException () {
    }
    public FileTreatmentException (String msg) {
        super(msg);
    }
}
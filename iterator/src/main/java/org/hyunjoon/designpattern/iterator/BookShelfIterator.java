package org.hyunjoon.designpattern.iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        // only called by BookShelf class, never gets null-parameter
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (bookShelf.getLength() < index) {
            return true;
        }
        return false;
    }

    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
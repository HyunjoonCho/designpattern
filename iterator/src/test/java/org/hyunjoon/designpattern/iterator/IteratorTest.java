package org.hyunjoon.designpattern.iterator;

import org.slf4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class IteratorTest {
    private Logger logger;

    @Test
    public void addBooks() {
        logger = LoggerFactory.getLogger(this.getClass());
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("Demian"));
        bookShelf.appendBook(new Book("The Alchemist"));
        bookShelf.appendBook(new Book("The Foundation of Love"));

        Assert.assertEquals(bookShelf.getLength(), 3);

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            logger.info(book.getName());
        }
        Assert.assertTrue(!it.hasNext());
    }

    @Test
    public void addBooksOverSize() {
        logger = LoggerFactory.getLogger(this.getClass());
        BookShelf bookShelf = new BookShelf(2);
        bookShelf.appendBook(new Book("Demian"));
        bookShelf.appendBook(new Book("The Alchemist"));
        bookShelf.appendBook(new Book("The Foundation of Love"));

        Assert.assertNotEquals(bookShelf.getLength(), 2);
        Assert.assertEquals(bookShelf.getBookAt(2).getName(), "The Foundation of Love");
    }
}

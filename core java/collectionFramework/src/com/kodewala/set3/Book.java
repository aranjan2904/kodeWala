package com.kodewala.set3;

public class Book {

    int bookId;
    String title;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.bookId == b.bookId;
    }

    @Override
    public int hashCode() {
        return bookId;
    }

    @Override
    public String toString() {
        return bookId + " " + title;
    }
}
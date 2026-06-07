package com.kodewala.set3;

import java.util.HashSet;
import java.util.Iterator;

public class Driver8 {

    public static void main(String[] args) {

        Book b1 = new Book(11, "Java");
        Book b2 = new Book(12, "Python");
        Book b3 = new Book(13, "Spring Boot");
        Book b4 = new Book(14, "React");
        Book b5 = new Book(11, "Java");
        Book b6 = new Book(15, "MongoDB");

        HashSet<Book> books = new HashSet<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);

        System.out.println("Size = " + books.size());

        for (Book book : books) {
            System.out.println(book.title);
        }

        System.out.println("-----------");

        Iterator<Book> itr = books.iterator();

        while (itr.hasNext()) {
            Book book = itr.next();
            System.out.println(book.title);
        }
    }
}
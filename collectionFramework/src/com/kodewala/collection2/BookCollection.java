package com.kodewala.collection2;

import java.util.ArrayList;

public class BookCollection {
    public static void main(String[] args) {
        
        // Creating Book objects written by Indian authors
        Book b1 = new Book("The Immortals of Meluha", "Amish Tripathi", "Mythology", "2010");
        Book b2 = new Book("The Guide", "R.K. Narayan", "Fiction", "1958");
        Book b3 = new Book("The Palace of Illusions", "Chitra Banerjee Divakaruni", "Mythology", "2008");
        Book b4 = new Book("Train to Pakistan", "Khushwant Singh", "History", "1956");
        Book b5 = new Book("The Secret of the Nagas", "Amish Tripathi", "Mythology", "2011");
        Book b6 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", "Biography", "1999");
        Book b7 = new Book("The God of Small Things", "Arundhati Roy", "Fiction", "1997");
        Book b8 = new Book("Asura: Tale of the Vanquished", "Anand Neelakantan", "Mythology", "2012");
        Book b9 = new Book("The White Tiger", "Aravind Adiga", "Fiction", "2008");
        Book b10 = new Book("Midnight's Children", "Salman Rushdie", "Fiction", "1981");

        // Initializing the ArrayList
        ArrayList<Book> bookList = new ArrayList<Book>();
        
        // Adding Indian books to the list
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
        bookList.add(b7);
        bookList.add(b8);
        bookList.add(b9);
        bookList.add(b10);

        int count = 0;
        
        // Looping through the list to filter "Mythology" books
        for(int i = 0; i < bookList.size(); i++) {
            Book currentBook = bookList.get(i);
            
            if(currentBook.getGenre().equals("Mythology")) {
                System.out.println(currentBook.getTitle() + " by " + currentBook.getAuthor());
                count = count + 1;
            }
        }
        
        System.out.println("Total Mythology books are: " + count);
    }
}
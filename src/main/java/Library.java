package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class Library {
    private Book book;
 
    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }
 
    public void displayBookDetails() {
        System.out.println("Book Details: Title - " + book.getTitle() + ", Author - " + book.getAuthor());
    }
}

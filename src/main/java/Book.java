package com.example;
public class Book {
    private String title;
    private String author;
 
    // Getters and Setters
    // Default constructor
    public Book() {
    }
 
    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
 
    // Getter for title
    public String getTitle() {
        return title;
    }
 
    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
 
    // Getter for author
    public String getAuthor() {
        return author;
    }
 
    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
 
    // toString method for better object representation
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

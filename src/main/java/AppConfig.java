package com.example;
 
import com.example.Book;
import com.example.Student;
import com.example.Classroom;
import com.example.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class AppConfig {
	@Bean
    public Book book() {
        Book book = new Book();
        book.setTitle("Sample Title");
        book.setAuthor("Sample Author");
        return book;
    }
 
    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("ABC");
        student.setAge(25);
        return student;
    }
    
	@Bean
    public Library library(Book book) {
        Library library = new Library();
        library.setBook(book);
        return library;
    }
 
    @Bean
    public Classroom classroom(Student student) {
        return new Classroom(student);
    }
}

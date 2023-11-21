package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
 
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    @Autowired
    private Library library;
 
    @Autowired
    private Classroom classroom;
 
    @Override
    public void run(ApplicationArguments args) {
        library.displayBookDetails();
        classroom.displayStudentDetails();
    }
}
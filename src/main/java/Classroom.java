package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class Classroom {
    private final Student student;
 
    @Autowired
    public Classroom(Student student) {
        this.student = student;
    }
 
    public void displayStudentDetails() {
        System.out.println("Student Details: Name - " + student.getName() + ", Age - " + student.getAge());
    }
}
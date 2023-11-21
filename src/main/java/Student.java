package com.example;
 
public class Student {
    private String name;
    private int age;
 
    // Default constructor
    public Student() {
    }
 
    // Parameterized constructor
    public Student(String name, int age) {
this.name = name;
        this.age = age;
    }
 
    // Getter for name
    public String getName() {
        return name;
    }
 
    // Setter for name
    public void setName(String name) {
this.name = name;
    }
 
    // Getter for age
    public int getAge() {
        return age;
    }
 
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
 
    // toString method for better object representation
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

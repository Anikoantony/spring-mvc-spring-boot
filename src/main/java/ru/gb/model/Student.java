package ru.gb.model;

import java.util.Stack;

public class Student {
    private static Long counter = 1L;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
        this.id = counter++;
        this.name="Student " + id;


    }
}

package ru.gb.model;

import java.util.Stack;

public class Student {
    private static Long counter = 1L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student() {
        this.id = counter++;
        this.name="Student " + id;


    }
}

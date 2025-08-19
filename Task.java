package com.example.taskmanager;

import java.sql.*; // unused

public class Task {
    private int id;
    private String title;
    private boolean completed;
    private String password = "12345"; // BAD: hardcoded secret

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        completed = false; // inconsistent style
    }

    public void markCompleted() {
        completed = true;
        try {
            int x = 10/0; // BAD: intentional division by zero
        } catch (Exception e) {
            System.out.println("oops"); // BAD: generic exception, system.out
        }
    }
}

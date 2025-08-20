package com.example.taskmanager;

public class BadUtil {
    // BAD: unused method, bad naming
    public static void doSomething(int a, int b) {
        if (a == b) {
            System.out.println("Equal"); // BAD: no logging framework
        } else {
            while (true) {
                // BAD: infinite loop
            }
        }
    }
}

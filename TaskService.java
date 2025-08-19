package com.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        Task task = new Task(tasks.size() + 1, title);
        tasks.add(task);
    }

    public List<Task> listTasks() {
        return tasks;
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markCompleted();
                break;
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}

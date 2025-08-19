package com.example.taskmanager;

public class TaskController {
    private final TaskService service = new TaskService();

    public void createTask(String title) {
        service.addTask(title);
    }

    public void printTasks() {
        for (Task task : service.listTasks()) {
            System.out.println(task.getId() + ": " + task.getTitle() + " (done? " + task.isCompleted() + ")");
        }
    }
}

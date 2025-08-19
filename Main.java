package com.example.taskmanager;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        service.addTask("Build AI Reviewer");
        service.addTask("Test PR workflow");

        service.completeTask(1);

        for (Task t : service.listTasks()) {
            System.out.println(t.getId() + ". " + t.getTitle() + " (done? " + t.isCompleted() + ")");
        }
    }
}

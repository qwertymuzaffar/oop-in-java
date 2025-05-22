package collections;

import java.util.LinkedList;

public class TaskManager {
    private LinkedList<String> tasks;

    public TaskManager() {
        tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void completeTask() {
        if (!tasks.isEmpty()) {
            String completedTask = tasks.removeFirst();
            System.out.println("Completed Task: " + completedTask);
        } else {
            System.out.println("No tasks to complete.");
        }
    }

    public void displayTasks() {
        System.out.println("Current Tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Finish report");
        manager.addTask("Email client");
        manager.displayTasks();

        manager.completeTask();
        manager.displayTasks();
    }
}

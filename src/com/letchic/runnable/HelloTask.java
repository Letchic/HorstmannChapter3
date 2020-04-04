package com.letchic.runnable;

public class HelloTask implements Runnable {
    String name;
    public HelloTask(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Hello, " + name);
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable task: tasks) {
            new Thread(task).start();
        }
    }
    public static void runInOrder(Runnable... tasks) {
        for (Runnable task: tasks) {
            task.run();
        }
    }
}
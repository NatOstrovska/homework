package com.ua.homework32;

public class ThreadRunnable implements Runnable{
    private final String threadName;
    public ThreadRunnable(String threadName) {
    this.threadName = threadName;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

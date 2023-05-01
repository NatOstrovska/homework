package com.ua.homework32;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadRunnable("Thread1"));
        Thread thread2 = new Thread(new ThreadRunnable( "Thread2"));

        thread1.start();
        thread2.start();
    }
}

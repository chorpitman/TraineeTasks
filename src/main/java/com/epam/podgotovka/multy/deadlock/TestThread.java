package com.epam.podgotovka.multy.deadlock;

public class TestThread {
    String object = "Lock";
    String object1 = "Step";

    Thread thread = (new Thread("Thread1") {
        public void run() {
            while (true) {
                synchronized (object) {
                    synchronized (object1) {
                        System.out.println(Thread.currentThread().getName() + " " + object + " " + object1);
                    }
                }
            }
        }
    });

    Thread thread1 = (new Thread("Thread1") {
        public void run() {
            while (true) {
                synchronized (object1) {
                    synchronized (object) {
                        System.out.println(Thread.currentThread().getName() + " " + object + " " + object1);
                    }
                }
            }
        }
    });

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.thread.start();
        testThread.thread1.start();
    }
}
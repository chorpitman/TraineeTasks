package com.epam.podgotovka.multy;

public class AppThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value child Thread - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Work of child Thread is over");
    }
}

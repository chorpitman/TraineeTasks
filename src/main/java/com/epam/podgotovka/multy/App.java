package com.epam.podgotovka.multy;

public class App {
    public static void main(String[] args) {
        System.out.println("Parent Thread ");
        Thread t = new Thread(new AppThread(), "MyNameIs");
        t.start();
    }
}

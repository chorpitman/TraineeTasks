package com.epam.designpattern.chapter_1.singletons;

public class LazySingleton {
    private static volatile LazySingleton ourInstance;

    private LazySingleton(){}

    public static LazySingleton getOurInstance() {
            if (ourInstance == null) {
                ourInstance = new LazySingleton();
            }

        return ourInstance;
    }
}

package com.epam.homeworks.hw8_multythreading;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
    public static void main(String[] args) {
        String directory = "/Users/Oleg/Documents/ECLIPSE BACkUP/BookHorstman_Tom1/bin/Glava_03";
        String keyWord = "public";

        FileTask fileTask = new FileTask();

        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorCompletionService<Integer> service = new ExecutorCompletionService<Integer>(executorService);


    }
}

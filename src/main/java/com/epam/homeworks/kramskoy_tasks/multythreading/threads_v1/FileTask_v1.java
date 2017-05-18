package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Callable;

 class FileTask_v1 implements Callable<Integer> {

    private String key;
    private File file;

    public FileTask_v1(File file, String key) {
        this.file = file;
        this.key = key;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getId() + " -> " + Thread.currentThread().getName());

        int count = 0;
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(key)) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("fileName = " + file.getName() + " count = " + count);
        return count;
    }
}

package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SingleThread {
    private File rootDirectory;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SingleThread matcher = new SingleThread(new File("D:\\DOWNLOADS\\JAVAFOLDERTEST"));
        System.out.println(matcher.task("java"));//330982
        long end = System.currentTimeMillis() - start;
        System.out.println("time = " + end);
    }

    public SingleThread(File directory) {
        this.rootDirectory = directory;
    }

    public int task(String keyWord) { // call return int
        int count = 0;
        File[] files = rootDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    count = count + countKeyWords(keyWord, file);
                }
            }
        }
        return count;
    }

    private int countKeyWords(String keyWords, File file) {
        int count = 0;
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(keyWords)) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }
}

class MyMatcher {
    private File rootDirectory;

    public MyMatcher(File directory) {
        this.rootDirectory = directory;
    }

    public int task(String keyWord) throws FileNotFoundException { // call return int
        int count = 0;
        File[] files = rootDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    count += countKeyWords(keyWord, file);
                }
            }
        }
        return count;
    }

    private int countKeyWords(String keyWords, File file) throws FileNotFoundException {
        int count = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(keyWords)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        MyMatcher matcher = new MyMatcher(new File("D:\\tmp"));
        System.out.println(matcher.task("java"));//330982
        long end = System.currentTimeMillis() - start;
        System.out.println("time = " + end);
    }
}

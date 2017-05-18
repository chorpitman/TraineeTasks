package com.epam.homeworks.hw8_multythreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.Callable;

class FileTask implements Callable<Integer> {
    private File file;

    private String key;

    public FileTask() {
    }

    public FileTask(File file, String key) {
        this.file = file;
        this.key = key;
    }

    @Override
    public Integer call() {
        System.out.println(Thread.currentThread().getId() + " -> " + Thread.currentThread().getName());

        int countKeyWord = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.contains(key)) {
                    countKeyWord++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("fileName = " + file.getName() + " count " + countKeyWord);
        return countKeyWord;
    }

    public List<FileTask> getFileTask(String directoryPath, String keyWord) {
        if (directoryPath == null || directoryPath.isEmpty()) {
            return Collections.<FileTask>emptyList();
        }
        File rootDirectory = new File(directoryPath);
        File[] files = rootDirectory.listFiles();
        if (files != null) {
            List<FileTask> fileTasks = new LinkedList<>();
            for (File file : files) {
                if (file.isFile()) {
                    fileTasks.add(new FileTask(file, keyWord));
                }
            }
            return fileTasks;
        } else {
            return Collections.<FileTask>emptyList();
        }
    }


}

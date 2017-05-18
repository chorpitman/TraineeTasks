package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v4;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;

public class Searcher {

    private String key;
    private CompletionService<Integer> service;
    private int i;
    private int count;

    public Searcher(String path, String key) {
        this.key = key;
        File root = new File(path);
        if (root.exists()) {
            ExecutorService executor = Executors.newCachedThreadPool();
            service = new ExecutorCompletionService<Integer>(executor);
            process(root);
            executor.shutdown();
        }
    }

    public int getCount() {
        while (i > 0) {
            try {
                count += service.take().get();
                i--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    private void process(File file) {
        File[] files = file.listFiles();
        for (File item : files) {
            if (item.isDirectory()) {
                process(item);
            } else {
                start(new Task(item));
            }
        }
    }

    private void start(Task task) {
        service.submit(task);
        i++;
    }

    private class Task implements Callable<Integer> {
        private File file;

        public Task(File file) {
            this.file = file;
        }

        @Override
        public Integer call() throws Exception {
            System.out.println(Thread.currentThread().getName());
            int count = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(key)) {
                    count++;
                }
            }
            System.out.println("count = " + count + " file = " + file);
            return count;
        }
    }

    public static void main(String[] args) {
        String path = "D:/projects/tmp";
        String key = "va";

        Searcher searcher = new Searcher(path, key);
        System.out.println(searcher.getCount());
    }
}
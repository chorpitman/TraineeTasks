package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class FileManager  {
    public static void main(String[] args) {
        String path = "D:\\DOWNLOADS\\JAVAFOLDERTEST";
        String keyWord = "java";

        long start = System.currentTimeMillis();

        FileManager fileTasks = new FileManager(path, keyWord);
        int result = fileTasks.getCount();

        System.out.println("[Total result] = " + result);
        System.out.println("[Total time] = " + (System.currentTimeMillis() - start) + " ms");
    }

    private List<Task> taskList = new ArrayList<>();
    private ExecutorCompletionService<Integer> service;

    //конструктор
    private FileManager(String directoryPath, String keyword) {
        File root = new File(directoryPath);
        if (root.exists()) {
            taskList = createFileTasksRecursion(root, keyword);
            submitFileTaskInThread();
        }
    }

    private int getCount() {
        int result = 0;

        for (int i = 0; i < taskList.size(); i++) {
            try {
                result = result + service.take().get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private void submitFileTaskInThread() {
        if (!taskList.isEmpty()) {
            /*Интерфейс, который
            описывает сервис для запуска Runnable или Callable задач.
            Методы submit на вход принимают задачу в виде Callable или Runnable,
            а в качестве возвращаемого значения идет Future, через который можно
            получить результат.*/
//            ExecutorService executor = Executors.newFixedThreadPool(taskList.size());
            ExecutorService executor = Executors.newSingleThreadExecutor();
            service = new ExecutorCompletionService<>(executor);

            //Метод submit возвращает объект Future, который содержит информацию о статусе исполнения переданного Сallable
            for (Task task : taskList) {
                service.submit(task);
            }
            executor.shutdown();
        }
    }

    private List<Task> createFileTasksRecursion(File directoryPath, String keyWord) {
        File[] files = directoryPath.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    createFileTasksRecursion(file, keyWord);
                } else {
                    taskList.add(new Task(file, keyWord));
                }
            }
        }
        return taskList;
    }

    class Task implements Callable<Integer> {
        private File file;
        private String key;

        public Task(File file, String key) {
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
}

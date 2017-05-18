package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v2;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FileTaskManager_v2 {
    private List<FileTask_v2> fileTask = new LinkedList<>();
    private ExecutorCompletionService<Integer> service;

    public FileTaskManager_v2(String directoryPath, String keyWord) {
        File root = new File(directoryPath);
        if (root.exists()) {
            fileTask = createFileTasksRecursion(root, keyWord);
            submitFileTaskInThread();
        }
    }

    public int getCount() {
        int result = 0;

        for (int i = 0; i < fileTask.size(); i++) {
            try {
                result = result + service.take().get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private void submitFileTaskInThread() {
        if (!fileTask.isEmpty()) {
            /*Интерфейс, который
            описывает сервис для запуска Runnable или Callable задач.
            Методы submit на вход принимают задачу в виде Callable или Runnable,
            а в качестве возвращаемого значения идет Future, через который можно
            получить результат.*/
            ExecutorService executor = Executors.newFixedThreadPool(fileTask.size());
//            ExecutorService executor = Executors.newSingleThreadExecutor();
            service = new ExecutorCompletionService<>(executor);

            //Метод submit возвращает объект Future, который содержит информацию о статусе исполнения переданного Сallable
            for (FileTask_v2 task : fileTask) {
                service.submit(task);
            }
            executor.shutdown();
        }
    }

    private List<FileTask_v2> createFileTasksRecursion(File directoryPath, String keyWord) {
        File[] files = directoryPath.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    createFileTasksRecursion(file, keyWord);
                } else {
                    fileTask.add(new FileTask_v2(file, keyWord));
                }
            }
        }
        return fileTask;
    }

}
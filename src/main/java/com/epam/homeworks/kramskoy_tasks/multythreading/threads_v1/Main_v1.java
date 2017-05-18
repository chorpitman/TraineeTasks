package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v1;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main_v1 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        String path = "D:\\tmp";
        String keyWord = "java";

        //замер времени
        long start = System.currentTimeMillis();

        List<FileTask_v1> fileTaskV1s = getFileTasks(path, keyWord);

        //запуск потоков. Фабрика потоков
        ExecutorService executor = Executors.newCachedThreadPool();
        ExecutorCompletionService<Integer> service = new ExecutorCompletionService<>(executor);

        //в цикле отправляем и получаем ответ
        for (FileTask_v1 file : fileTaskV1s) {
            service.submit(file);
        }

        int result = 0;
        for (int i = 0; i < fileTaskV1s.size(); i++) {
            result = result + service.take().get();
        }

        //завершаем работу фабрики потково
        executor.shutdown();


        long end = System.currentTimeMillis() - start;
        System.out.println("total result " + result);
        System.out.println("time = " + end);
    }

    private static List<FileTask_v1> getFileTasks(String directoryPath, String keyWord) {
        if (directoryPath == null || directoryPath.isEmpty()) {
            return Collections.<FileTask_v1>emptyList();
        } else {
            File rootDirectory = new File(directoryPath);
            File[] files = rootDirectory.listFiles();
            if (files != null) {
                List<FileTask_v1> fileTaskV1s = new LinkedList<>();
                for (File file : files) {
                    if (file.isFile()) {
                        fileTaskV1s.add(new FileTask_v1(file, keyWord));
                    }
                }
                return fileTaskV1s;
            } else {
                return Collections.<FileTask_v1>emptyList();
            }
        }
    }
}

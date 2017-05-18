package com.epam.podgotovka.multy.newtest;

import java.util.concurrent.*;

public class ReadingFile {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final int threadCount = 10;

        // BlockingQueue with a capacity of 200
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(200);

        // create thread pool with given size
        ExecutorService service = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i < (threadCount - 1); i++) {
            service.submit(new CPUTask(queue));
        }

        // Wait til FileTask_v1 completes
        service.submit(new FileTask(queue)).get();

        service.shutdownNow();  // interrupt CPUTasks

        // Wait til CPUTasks terminate
        service.awaitTermination(365, TimeUnit.DAYS);

    }
}


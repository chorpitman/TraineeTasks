package com.epam.podgotovka.multy.newtest;

import java.util.concurrent.BlockingQueue;

class CPUTask implements Runnable {

    private final BlockingQueue<String> queue;

    public CPUTask(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        String line;
        while (true) {
            try {
                // block if the queue is empty
                line = queue.take();
                // do things with line
            } catch (InterruptedException ex) {
                break; // FileTask_v1 has completed
            }
        }
        // poll() returns null if the queue is empty
        while ((line = queue.poll()) != null) {
            // do things with line;
        }
    }
}

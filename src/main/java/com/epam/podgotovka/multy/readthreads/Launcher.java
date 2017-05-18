package com.epam.podgotovka.multy.readthreads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Launcher {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
        ReaderThread reader = new ReaderThread(queue);
        new Thread(reader).start();

    }

}
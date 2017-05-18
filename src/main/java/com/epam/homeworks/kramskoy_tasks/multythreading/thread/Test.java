package com.epam.homeworks.kramskoy_tasks.multythreading.thread;

import java.util.concurrent.*;

public class Test extends Thread {

    private long timeout;

    public Test(long timeout) {
        this.timeout = timeout;
    }

    @Override
    public void run() {
        System.out.println("Run........." + currentThread().getName());
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exit........." + currentThread().getName());
    }

    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            new Main1(i * 10).start();
        }
        System.out.println("Bye");*/

        /*for (int i = 0; i < 10; i++) {
            new Thread(new Counter1(i * 1000)).start();
        }*/

        int n = 100;
        ExecutorService executors = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            Future<Integer> future = executors.submit(new B(i * 100));
            try {
                if (future.isDone())
                    System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executors.shutdown();
        System.out.println("Bye");
    }
}

class A implements Runnable {

    private long timeout;

    public A(long timeout) {
        this.timeout = timeout;
    }

    @Override
    public void run() {
        System.out.println("Run........." + Thread.currentThread().getName());
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exit........." + Thread.currentThread().getName());
    }
}

class B implements Callable<Integer> {

    private long timeout;

    public B(long timeout) {
        this.timeout = timeout;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Run........." + Thread.currentThread().getName());
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int res = 0;
        for (int i = 0; i < 100000; i++) {
            res += i;
        }

        System.out.println("Exit........." + Thread.currentThread().getName());
        return res;
    }
}

package com.epam.homeworks.kramskoy_tasks.multythreading.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Oleg_Chorpita on 4/7/2016.
 */
public class Golovach {
    public static void main(String[] args) {
        AtomicLong result = new AtomicLong(0);
        new ForkJoinPool().invoke(new Task(0, 1000_000, result));
        System.out.println(result.get());
    }

    public static class Task extends RecursiveAction {
        private final int from;
        private final int to;
        private final AtomicLong result;

        public Task(int from, int to, AtomicLong result) {
            this.from = from;
            this.to = to;
            this.result = result;
        }

        @Override
        protected void compute() {
            if (to - from < 10_000) {
                for (int index = from; index < to; index++) {
                    if (index % 3 != 0 && index % 5 != 0) {
                        result.addAndGet(index);
                    }
                }
            } else {
                int mid = (from + to) >>> 1;
                Task taskLeft = new Task(from, mid, result);
                Task taskRight = new Task(mid, to, result);
                invokeAll(taskLeft, taskRight);
            }
        }
    }
}
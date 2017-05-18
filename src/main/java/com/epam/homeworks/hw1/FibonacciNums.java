package com.epam.homeworks.hw1;

public class FibonacciNums {
    public static void main(String[] args) {
        final int SIZE_FIBONACCI = 10;

        int nums[] = new int[SIZE_FIBONACCI];

        for (int i = 0; i < SIZE_FIBONACCI; i++) {
            if (i == 0 || i == 1) {
                nums[i] = i;
            } else {
                nums[i] = nums[i - 1] + nums[i - 2];
            }
        }
        System.out.println(nums[SIZE_FIBONACCI - 1]);
    }

}

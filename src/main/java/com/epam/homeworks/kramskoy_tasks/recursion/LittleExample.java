package com.epam.homeworks.kramskoy_tasks.recursion;

  class LittleExample {
    public static void main(String[] args) {
        recursion(2);
    }

    public static void recursion(int x) {
//        System.out.println(" " + x);
        if (x < 15) {
            recursion(2 * x);
        }
        System.out.println(" " + x);

    }
}

package com.epam.homeworks.kramskoy_tasks.recursion;

public class Recursion_v1 {
    public static void main(String[] args) {
//        System.out.println(f2(5));
//        System.out.println("*********");
        f1(1);
    }

    public static int f(int n) {
        if (n == 1) {
            return n;
        }
        return n * f(n-1);
    }

    public static int f2(int n) {
        return n == 1 ? 1 : n * f(n-1);
    }

    public static void f1(int x) {
//        System.out.print(" " + x);
        if (x < 15) {
            f1(2 * x);
        }
//        System.out.println();
        System.out.print(" " + x);
    }
}

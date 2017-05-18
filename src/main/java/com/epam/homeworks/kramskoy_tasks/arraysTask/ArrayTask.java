package com.epam.homeworks.kramskoy_tasks.arraysTask;

public class ArrayTask {
    public static void main(String[] args) {
        create1DArray(2);
        System.out.println();
        System.out.println("===============================");
        create2DArray(2);
        System.out.println("===============================");
        int[] a = {3, 4, 2, 7};
        print2DArray(createRagged2DArray(a));
    }

    public static void create1DArray(int arrayLength) {
        int[] a = new int[arrayLength];
        double randomResult = 0;
        for (int i = 0; i < a.length; i++) {
            randomResult = Math.random() * 100;
            a[i] = (int) randomResult;
            System.out.print(a[i] + " ");
        }
    }

    public static void create2DArray(int arrayLength) {
        int[][] a = new int[arrayLength][arrayLength];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        //print
        for (int[] itemA : a) {
            for (int itemB : itemA) {
                System.out.print(itemB + "; ");
            }
            System.out.println();
        }
    }

    public static int[][] createRagged2DArray(int[] array1D) {
        int[][] array2D = new int[array1D.length][];
        for (int i = 0; i < array1D.length; i++) {
            array2D[i] = new int[array1D[i]];
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array1D[i] % 2 == 0) {
                    array2D[i][j] = array1D[i] + j * 1;
                } else {
                    array2D[i][j] = array1D[i] + j * 2;
                }
            }
        }
        return array2D;
    }

    public static void print2DArray(int[][] array) {
        for (int[] itemA : array) {
            for (int itemB : itemA) {
                System.out.print(itemB + "; ");
            }
            System.out.println();
        }
    }

}

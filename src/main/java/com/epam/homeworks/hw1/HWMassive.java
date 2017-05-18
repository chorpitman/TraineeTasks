package com.epam.homeworks.hw1;

public class HWMassive {
    private static final int SIZE = 3; //размеронось двумерного массива

    public static void main(String[] args) {
        int[][] array = generateMassive();
        printArray(array);

        int[][] trans = transponMatrix(array);
        printArray(trans);

        minTriangleMatrixLeft(array);
        maxTriangleMatrixTop(array);
        minTriangleRight(array);
    }

    // МЕТОДЫ
    // генерация массива и вывод на экран
    public static int[][] generateMassive() {
        int[][] arrayNums = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arrayNums[i][j] = (int) (Math.random() * 100);
            }
        }
        return arrayNums;
    }

    private static void printArray(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Матрица размерностью: " + SIZE + " X " + SIZE);
        System.out.println("--------------------------------");
    }

    public static void minTriangleMatrixLeft(int[][] arrayNums) {
        int min = arrayNums[0][0];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(arrayNums[i][j] + " ");

                if (min > arrayNums[i][j]) {
                    min = arrayNums[i][j];
                }
            }
            // Переход на следующую строку
            System.out.println();
        }
        System.out.println();
        System.out.println("Min element: " + min);
        System.out.println("--------------------------------");
    }

    public static void maxTriangleMatrixTop(int[][] arrayNums) {
        int max = arrayNums[0][0];
        int n = (int) Math.floor((float) SIZE / 2);

        for (int i = 0; i <= n; i++) {
            for (int j = 0, k = i; j < (SIZE - 2 * i); j++, k++) {
                System.out.print(arrayNums[i][k] + " ");

                if (max < arrayNums[i][k]) {
                    max = arrayNums[i][k];
                }
            }
            System.out.println();
        }
        System.out.println("Mах element: " + max);
        System.out.println("--------------------------------");
    }

    public static void minTriangleRight(int[][] arrayNums) {
        int min = arrayNums[0][0];

        for (int i = SIZE - 1; i >= 0; i--) {
            for (int j = SIZE - 1; j >= i; j--) {
                System.out.print(arrayNums[i][j] + " ");
                if (min > arrayNums[i][j]) {
                    min = arrayNums[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Min element: " + min);
        System.out.println("--------------------------------");
    }

    public static int[][] transponMatrix(int[][] arrayNums) {
        int tArrayNums[][] = new int[arrayNums.length][arrayNums.length];

        for (int i = 0; i < arrayNums.length; i++) {
            for (int j = 0; j < arrayNums[i].length; j++) {
                tArrayNums[j][i] = arrayNums[i][j];
            }
        }
        return tArrayNums;
        // печать массива на экран
    }

}

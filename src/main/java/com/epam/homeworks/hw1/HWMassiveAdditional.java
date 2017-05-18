package com.epam.homeworks.hw1;

public class HWMassiveAdditional {
    public static final int ARRAY_LENGHT = 20;

    public static void main(String[] args) {
        int[] array = generateMassive(); //generatemassive
        printArray(array); //printArray
        System.out.println();

        sumElements(array); //Array elements summ
        System.out.println();

        countEvenElements(array); //Count Even Elements of Array
        System.out.println();

        sumEvenElements(array); //Count Even Elements of Array
    }


    public static int[] generateMassive() {
        int[] arrayNums = new int[ARRAY_LENGHT];
        for (int i = 0; i < ARRAY_LENGHT; i++) {
            arrayNums[i] = (int) (Math.random() * 10);
        }
        return arrayNums;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < ARRAY_LENGHT; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    public static void sumElements(int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum = sum + anArray;
        }
        System.out.println(sum);
        System.out.println("___________________");

    }

    public static void countEvenElements(int[] array) {
        int countEvenElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                countEvenElement++;
            }
        }
        System.out.println("Count even elements: " + countEvenElement);
        System.out.println("___________________");

    }

    public static void sumEvenElements(int[] array) {
        int sumEvenElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEvenElement += array[i];
            }
        }
        System.out.println("sumEvenElement " + sumEvenElement);
        System.out.println("___________________");
    }
}
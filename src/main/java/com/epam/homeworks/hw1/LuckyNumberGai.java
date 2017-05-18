package com.epam.homeworks.hw1;

import java.util.Arrays;

public class LuckyNumberGai {
    public static void main(String[] args) {

        int[] number = new int[4];
        int totalCount = 0;

        sortArray(number);


        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        number[0] = i;
                        number[1] = j;
                        number[2] = k;
                        number[3] = l;
                        int sum = number[0] + number[1];
                        int sum1 = number[2] + number[3];

                        if (sum == sum1) {
                            int sum2 = sum % 10;
                            int sum3 = sum / 10;
                            int result = sum2 + sum3;

                            totalCount++;
                            System.out.println("Lucky Number " + number[0] + number[1] + number[2] + number[3]);
                            System.out.println("Sum of numbers " + sum);
                            System.out.println(result);
                            System.out.println("____________________");
                        }
                    }
                }
            }
        }
        System.out.println("total count " + totalCount);
        System.out.println("*************************************");
    }

    public static void sortArray(int[] arrray) {
        Arrays.sort(arrray);
    }


}
